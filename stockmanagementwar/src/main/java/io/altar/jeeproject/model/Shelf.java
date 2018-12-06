package io.altar.jeeproject.model;

public class Shelf extends Entity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Variables
	private Product product = null;
	private int capacity;
	private int dailyRentPrice;
	public Shelf() {}
	/**
	 * @param capacity
	 * @param dailyRentPrice
	 * @param product  
	 * @param product 
	 */
	public Shelf(int capacity,int dailyRentPrice) {
		super();
		this.capacity = capacity;
		this.dailyRentPrice = dailyRentPrice;
	}
	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}
	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}
	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}
	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	/**
	 * @return the dailyRentPrice
	 */
	public int getDailyRentPrice() {
		return dailyRentPrice;
	}
	/**
	 * @param dailyRentPrice the dailyRentPrice to set
	 */
	public void setDailyRentPrice(int dailyRentPrice) {
		this.dailyRentPrice = dailyRentPrice;
	}
	/**
	 * @return str Products in string
	 */
//	private String printProducts() {
//		String str = "";
//
//		for (int i = 0; i < this.product.size(); i++) {
//			str += this.product.get(i).getId();
//			str += ", ";
//		}
//		return str;
//	}
	@Override
	public String toString() {
		return "Shelf [product=" + product + ", capacity=" + capacity + ", dailyRentPrice=" + dailyRentPrice + "]";
	}
	
	
}
