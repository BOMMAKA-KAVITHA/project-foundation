package com.Flipkart.controller;

import java.util.List;

import com.Flipkart.entity.FlipkartUser;

public interface FlipkartControllerInterface {

	int signup();

	FlipkartUser signin();

	FlipkartUser viewprofilecontroller();

	int deleteprofilecontroller();

	List<FlipkartUser> viewAllprofilecontroller();

	FlipkartUser searchprofilecontroller();

	int editprofilecontroller();

	List<FlipkartUser> sortprofilecontroller();

}
