/**
 * 
 */
package com.java.shoppingcart;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vimal Panchal
 *
 */
public class ShoppingCartTest {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoppingCart sc = new ShoppingCart();
		
		List<CustomerDiscount> list = new ArrayList<CustomerDiscount>();
		
		list.add(new CustomerDiscount("REGULAR", 5000, 0));
		
		list.add(new CustomerDiscount("REGULAR", 10000, 10));
		list.add(new CustomerDiscount("REGULAR", 10001, 20));
		
		list.add(new CustomerDiscount("PREMIUM", 4000, 10));
		list.add(new CustomerDiscount("PREMIUM", 8000, 12));
		list.add(new CustomerDiscount("PREMIUM", 12000, 20));
		list.add(new CustomerDiscount("PREMIUM", 12001, 30));
		
		list.forEach(value -> System.out.println(value.getCustomerType() + " == "+ value.getMaxRange() + " " + value.getDiscount()));
		
		printDetails("REGULAR",10000, sc.calculateBillAmount("REGULAR", 10000, list));
		
	}

	
	static void printDetails(String customerType, int plAmont, int billAmont){
		System.out.println("Customer Type ::  " + customerType + "  Purchase Amount:: " + plAmont + " Bill Amount:: " + billAmont);
	}
	
	
	//if regular customer and purchase range is >5000 and < 10000 then 10 % else if  purchase amount is > 10000 20%
}
