package com.java.shoppingcart;

public class CustomerDiscount {
	
	private String customerType;
	
	private Integer maxRange;
	
	private Integer discount;

	/**
	 * @param customerType
	 * @param maxRange
	 * @param discount
	 */
	public CustomerDiscount(String customerType, Integer maxRange, Integer discount) {
		super();
		this.customerType = customerType;
		this.maxRange = maxRange;
		this.discount = discount;
	}

	/**
	 * @return the customerType
	 */
	public String getCustomerType() {
		return customerType;
	}

	/**
	 * @return the maxRange
	 */
	public Integer getMaxRange() {
		return maxRange;
	}

	/**
	 * @return the discount
	 */
	public Integer getDiscount() {
		return discount;
	}


}
