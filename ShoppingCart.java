package com.java.shoppingcart;

import java.util.List;

public class ShoppingCart {

	/**
	 * Adds the customer data.
	 *
	 * @param customerType
	 *            the customer type
	 * @param maxRange
	 *            the max range
	 * @param discountRate
	 *            the discount rate
	 * @return the hash map
	 */
/*	public HashMap<String, DiscountRange> addCustomerData(String customerType, int maxRange, int discountRate) {
		DiscountRange dr = new DiscountRange(maxRange, discountRate);
		HashMap<String, DiscountRange> sd = new HashMap<String, DiscountRange>();
		sd.put(customerType, dr);
		return sd;
	}*/
	
	/**
	 * Calculate bill amount.
	 *
	 * @param customerType the customer type
	 * @param purchaseValue the purchase value
	 * @param list the list
	 * @return the int
	 */
	public int calculateBillAmount(String customerType, int purchaseValue, List<CustomerDiscount> list) {
		
		if(customerType.equalsIgnoreCase("REGULAR")) {
			for (CustomerDiscount customerDiscount : list) {
				if(customerDiscount.getCustomerType().equalsIgnoreCase(customerType)) {
					if(purchaseValue >= 5000 && purchaseValue <= 10000) {
						return purchaseValue - purchaseValue*10/100;
					}else if(purchaseValue > 10000) {
						return purchaseValue - purchaseValue*20/100;
					}
				}
			}

		}else if(customerType.equalsIgnoreCase("PREMIUM")) {
			for (CustomerDiscount customerDiscount : list) {
				if(customerDiscount.getCustomerType().equalsIgnoreCase(customerType)) {
					if(purchaseValue > 0 && purchaseValue < 4000) {
						return purchaseValue - purchaseValue*10/100;
					}else if(purchaseValue >= 5000 && purchaseValue < 8000) {
						return purchaseValue - purchaseValue*20/100;
					}else if(purchaseValue >= 8000 && purchaseValue < 12000) {
						return purchaseValue - purchaseValue*20/100;
					}else if(purchaseValue > 12000){
						return purchaseValue - purchaseValue*30/100;
					}
				}
			}

		}

			

		
		return purchaseValue;

	}

}


