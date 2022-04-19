package com.spr;

public class Customer {
	public static int product = 50;
	public void purchase(int qty) {
		if (qty<product) {
			product -= qty;
			System.out.println("Current Stock "+product);
		}
		else {
			System.out.println("Stock does not exist");
		}
	}
}
