package io.altar.jeeproject.DTO;

import io.altar.jeeproject.model.Entity;


public class ShelfDTO extends Entity{

	private static final long serialVersionUID = 1L;
	
	private ProductDTO ProductDTO = null;
	private Long id;
	private int capacity;
	private int dailyRentPrice;
	
	public ShelfDTO(Long id, int capacity, int dailyRentPrice) {
		super();
		this.id = id;
		this.capacity = capacity;
		this.dailyRentPrice = dailyRentPrice;
	}
	public ShelfDTO(Long id) {
		super();
		this.id = id;
	}

	public ProductDTO getProduct() {
		return ProductDTO;
	}

	public void setProduct(ProductDTO product) {
		this.ProductDTO = product;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getDailyRentPrice() {
		return dailyRentPrice;
	}

	public void setDailyRentPrice(int dailyRentPrice) {
		this.dailyRentPrice = dailyRentPrice;
	}
	
	
	
	
}
