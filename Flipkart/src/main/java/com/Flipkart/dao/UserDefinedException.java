package com.Flipkart.dao;

public class UserDefinedException extends Exception {
	public String toString() {
		return "Reserved words are not allowed";
	}
}
