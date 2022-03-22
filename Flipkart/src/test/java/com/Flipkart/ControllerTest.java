package com.Flipkart;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.Flipkart.controller.FlipkartController;
import com.Flipkart.entity.FlipkartUser;

public class ControllerTest {
	FlipkartController fc=null;
	FlipkartUser fu;
	@Before
	public void setUp() throws Exception {
		fc=new FlipkartController();
	}

	@After
	public void tearDown() throws Exception {
		fc=null;
	}

	@Test
	public void testsignup() {
		int i=fc.signup();
		assert i>0:"Test failed to signup";
	}
	
	@Test
	public void testsignin() {
		FlipkartUser fu=fc.signin();
		assert fu!=null:"Test failed to signin";
	}
	@Test
	public void testviewprofilecontroller() {
		FlipkartUser s1=fc.viewprofilecontroller();
		assert s1!=null:"Test failed to view profile";
	}
	@Test
	public void testdeleteprofilecontroller() {
		int i=fc.deleteprofilecontroller();
		assert i>0:"Test failed to delete profile";
	}
	@Test
	public void testviewAllprofilecontroller() {
		List<FlipkartUser> ll=fc.viewAllprofilecontroller();
		assert ll!=null:"Test failed to delete profile";
	}
	@Test
	public void testsearchprofilecontroller() {
		FlipkartUser s3=fc.searchprofilecontroller();
		assert s3!=null:"Test failed to search profile";
	}
	@Test
	public void testeditprofilecontroller() {
		int i=fc.editprofilecontroller();
		assert i>0:"Test failed to search profile";
	}
	@Test
	public void testsortprofilecontroller() {
		List<FlipkartUser> ll=fc.sortprofilecontroller();
		assert ll!=null:"Test failed to sort profile";
	}


}
