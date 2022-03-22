package com.Flipkart.utility;

import com.Flipkart.service.FilpkartService;
import com.Flipkart.service.FlipkartServiceInterface;

public class ServiceFactory {

	public static FlipkartServiceInterface createObject() {
		// TODO Auto-generated method stub
		return new FilpkartService();
	}

}
