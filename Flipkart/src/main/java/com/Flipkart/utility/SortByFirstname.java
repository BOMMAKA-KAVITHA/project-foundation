package com.Flipkart.utility;

import java.util.Comparator;

import com.Flipkart.entity.FlipkartUser;

public class SortByFirstname implements Comparator<FlipkartUser> {

	@Override
	public int compare(FlipkartUser u1, FlipkartUser u2) {
		return u1.getFirstname().compareTo(u2.getFirstname());
	}
}
