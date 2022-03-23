package com.Flipkart;

import java.util.Scanner;

import com.Flipkart.controller.FlipkartControllerInterface;
import com.Flipkart.entity.FlipkartUser;
import com.Flipkart.utility.ControllerFactory;

public class FlipkartView {
	static int ch;
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		FlipkartControllerInterface fc=ControllerFactory.createObject();
		
		FlipkartUser s1=null;
		
		String s="y";
		
		while(s.equals("y")) {
		System.out.println("*******MAIN MENU************");
		System.out.println("press 1 to sign-up");
		System.out.println("press 2 to sign-in");
		System.out.println("Enter your choice");
		ch=sc.nextInt();
				
		
			switch(ch) {
			case 1:fc.signup();
				break;
			case 2:s1=fc.signin();
						if(s1!=null) {
							while(s.equals("y")) {
								System.out.println("***********MAIN MENU************");
								System.out.println("press 1 to view profile");
								System.out.println("press 2 to delete profile");
								System.out.println("press 3 to viewAll profile");
								System.out.println("press 4 to search profile");
								System.out.println("press 5 to edit profile");
								System.out.println("press 6 to sort profile");
								System.out.println("enter your choice");
								 ch=sc.nextInt();
//
								switch(ch) {
								case 1:fc.viewprofilecontroller();
									break;
								case 2:fc.deleteprofilecontroller();
									break;
								case 3:fc.viewAllprofilecontroller();
									break;
								case 4:fc.searchprofilecontroller();
									break;
								case 5:fc.editprofilecontroller();
									break;
								case 6:fc.sortprofilecontroller();
									break;
									
								}
								System.out.println("press y/n to continue");
								s=sc.next();
							}
						}
						else {
							System.out.println("Oops! You are not registered.. please press 1 to sigh-up");
						}
						break;
			}
			System.out.println("press y/n to continue");
			s=sc.next();
			
			
		}
	}
	}
						
						
						