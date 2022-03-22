package com.Flipkart.service;

import java.util.List;

import com.Flipkart.entity.FlipkartUser;

public interface FlipkartServiceInterface {

	int createprofileservice(FlipkartUser fu);

	FlipkartUser signin(FlipkartUser fu);

	FlipkartUser viewprofileservice(FlipkartUser fu);

	int deleteprofileservice(FlipkartUser fu);

	List<FlipkartUser> viewAllprofileservice();

	FlipkartUser searchprofileservice(FlipkartUser fu);

	int editprofileservice(FlipkartUser fu, FlipkartUser fu1);

	
	

}
