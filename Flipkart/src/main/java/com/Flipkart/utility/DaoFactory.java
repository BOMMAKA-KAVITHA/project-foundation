package com.Flipkart.utility;

import com.Flipkart.dao.FlipkartDao;
import com.Flipkart.dao.FlipkartDaoInterface;

public class DaoFactory {

	public static FlipkartDaoInterface createObject() {
		// TODO Auto-generated method stub
		return new FlipkartDao();
	}

}
