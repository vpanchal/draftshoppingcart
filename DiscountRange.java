/**
 * 
 */
package com.java.shoppingcart;

import java.io.Serializable;

/**
 * @author Vimal Panchal
 *
 */
public class DiscountRange implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int maxRange;
	private int discountRate;
	
	
	/**
	 * @param minRange
	 * @param maxRange
	 * @param discountRate
	 */
	public DiscountRange(int maxRange, int discountRate) {
		super();
		this.maxRange = maxRange;
		this.discountRate = discountRate;
	}
	public int getMaxRange() {
		return maxRange;
	}
	public int getDiscountRate() {
		return discountRate;
	}
	

}
