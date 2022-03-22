package com.Flipkart.service;

import java.util.List;

import com.Flipkart.dao.FlipkartDaoInterface;
import com.Flipkart.entity.FlipkartUser;
import com.Flipkart.utility.DaoFactory;

public class FilpkartService implements FlipkartServiceInterface {
	FlipkartDaoInterface fd=null;
	public FilpkartService() {
		fd=DaoFactory.createObject();
		
	}
	

	public int createprofileservice(FlipkartUser fu) {
		int i=fd.createprofileDao(fu);
		return i;
	}

	public FlipkartUser signin(FlipkartUser fu) {
		FlipkartUser s1=fd.signin(fu);
		return s1;
	}

	public FlipkartUser viewprofileservice(FlipkartUser fu) {
		FlipkartUser s1=fd.viewprofileDao(fu);
		return s1;
	}


	public int deleteprofileservice(FlipkartUser fu) {
		int i=fd.deleteprofileDao(fu);
		return i;
	}


	@Override
	public List<FlipkartUser> viewAllprofileservice() {
		List<FlipkartUser> s2=fd.viewAllprofileDao();
		return s2;
	}


	@Override
	public FlipkartUser searchprofileservice(FlipkartUser fu) {
		FlipkartUser s3=fd.searchprofileDao(fu);
		return s3;
	}


	@Override
	public int editprofileservice(FlipkartUser fu, FlipkartUser fu1) {
		int i=fd.editprofileDao(fu,fu1);
		return i;
	}

}
