package com.Flipkart.dao;

import java.util.List;

import com.Flipkart.entity.FlipkartUser;

public interface FlipkartDaoInterface {

	int createprofileDao(FlipkartUser fu);

	FlipkartUser signin(FlipkartUser fu);

	FlipkartUser viewprofileDao(FlipkartUser fu);

	int deleteprofileDao(FlipkartUser fu);

	List<FlipkartUser> viewAllprofileDao();

	FlipkartUser searchprofileDao(FlipkartUser fu);

	int editprofileDao(FlipkartUser fu, FlipkartUser fu1);

	

}
