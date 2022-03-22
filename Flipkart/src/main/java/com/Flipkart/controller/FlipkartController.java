package com.Flipkart.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import com.Flipkart.entity.FlipkartUser;
import com.Flipkart.service.FlipkartServiceInterface;
import com.Flipkart.utility.ServiceFactory;
import com.Flipkart.utility.SortByFirstname;

public class FlipkartController implements FlipkartControllerInterface {
	
	FlipkartServiceInterface fs=null;
	FlipkartUser fu;
	public FlipkartController() {
	fs=ServiceFactory.createObject();
	}
	
	Logger log=Logger.getLogger("FlipkartController");
	
	public int signup() {
		Scanner sc=new Scanner(System.in);
		log.info("enter firstname");
		String firstname=sc.next();
		
		log.info("enter lastname");
		String lastname=sc.next();
		
		log.info("enter email");
		String email=sc.next();
		
		log.info("enter password");
		String password=sc.next();
		
		log.info("enter address");
		String address=sc.next();
		
		FlipkartUser fu=new FlipkartUser();
		fu.setFirstname(firstname);
		fu.setLastname(lastname);
		fu.setEmail(email);
		fu.setPassword(password);
		fu.setAddress(address);
		
		int i=fs.createprofileservice(fu);
		
		if(i>0) {
			log.info("profile created");
		}
		else {
			log.info("could not create profile");
		}
		return i;
		}

	public FlipkartUser signin() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter email");
		String email=sc.next();
		
		System.out.println("enter password");
		String password=sc.next();
		
		FlipkartUser fu=new FlipkartUser();
		fu.setEmail(email);
		fu.setPassword(password);
		
		FlipkartUser s1=fs.signin(fu);
		return s1;
		
	}

	public FlipkartUser viewprofilecontroller() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter email");
		String email=sc.next();
		
		FlipkartUser fu=new FlipkartUser();
		fu.setEmail(email);
		
		FlipkartUser s1=fs.viewprofileservice(fu);
		
		if(s1!=null) {
			System.out.println("enter Firstname "+s1.getFirstname());
			System.out.println("enter Lastname "+s1.getLastname());
			System.out.println("enter Email "+s1.getEmail());
			System.out.println("enter Password "+s1.getPassword());
			System.out.println("enter Address "+s1.getAddress());
		}
		else {
			System.out.println("profile not found");
		}
		return s1;
	}
	public int deleteprofilecontroller() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter email");
		String email=sc.next();
		
		FlipkartUser fu=new FlipkartUser();
		fu.setEmail(email);
		
		int i=fs.deleteprofileservice(fu);
		
		if(i>0) {
			System.out.println("profile deleted");
		}
		else {
			System.out.println("could not delete profile");
		
		}
		return i;
		
		
		
	}
	public List<FlipkartUser> viewAllprofilecontroller() {
		List<FlipkartUser> ll=fs.viewAllprofileservice();
		ll.forEach(s2->{
			System.out.println("***********************");
			System.out.println(s2.getFirstname());
			System.out.println(s2.getLastname());
			System.out.println(s2.getEmail());
			System.out.println(s2.getPassword());
			System.out.println(s2.getAddress());
	});
		return ll;
}
	@Override
	public FlipkartUser searchprofilecontroller() {
		System.out.println("SEARCHING PROFILES: ");
		System.out.println("enter Firstname to search profile: ");
		Scanner sc=new Scanner(System.in);
		String firstname=sc.next();
		
		FlipkartUser fu=new FlipkartUser();
		fu.setFirstname(firstname);
		

		FlipkartUser s3=fs.searchprofileservice(fu);
		
		if(s3!=null) {
			System.out.println("enter Firstname "+s3.getFirstname());
			System.out.println("enter Lastname "+s3.getLastname());
			System.out.println("enter Email "+s3.getEmail());
			System.out.println("enter Password "+s3.getPassword());
			System.out.println("enter Address "+s3.getAddress());
		
}
		else {
			System.out.println("No profile found with the given firstname");
		}
		return s3;
	}
	@Override
	public int editprofilecontroller() {
		Scanner sc=new Scanner(System.in);
		System.out.println("EDIT PROFILE: ");
		System.out.println("enter the email whose profile you want to edit: ");
		String email = sc.next();
		
		FlipkartUser fu=new FlipkartUser();
		fu.setEmail(email);
		
		System.out.println("edit firstname: ");
		String firstname=sc.next();
		
		System.out.println("edit lastname: ");
		String lastname=sc.next();
		
		System.out.println("edit password: ");
		String password=sc.next();
		
		System.out.println("edit address: ");
		String address=sc.next();
		
		FlipkartUser fu1=new FlipkartUser();
		fu1.setFirstname(firstname);
		fu1.setLastname(lastname);
		fu1.setPassword(password);
		fu1.setAddress(address);
		
		int i=fs.editprofileservice(fu,fu1);
		
		if(i>0) {
			System.out.println("profile edited");
		}
		else {
		System.out.println("could not edit your profile");}
		return i;
	}
	@Override
	public List<FlipkartUser> sortprofilecontroller() {
		List<FlipkartUser> ll=fs.viewAllprofileservice();
		ll.forEach(s2->{
			System.out.println("***********Before Sorting************");
			System.out.println(s2.getFirstname());
			System.out.println(s2.getLastname());
			System.out.println(s2.getEmail());
			System.out.println(s2.getPassword());
			System.out.println(s2.getAddress());
		});
		Collections.sort(ll, new SortByFirstname());
		ll.forEach(s2->{
			System.out.println("********After Sorting***************");
			System.out.println(s2.getFirstname());
			System.out.println(s2.getLastname());
			System.out.println(s2.getEmail());
			System.out.println(s2.getPassword());
			System.out.println(s2.getAddress());
		});
		return ll;
		
	}
}	
