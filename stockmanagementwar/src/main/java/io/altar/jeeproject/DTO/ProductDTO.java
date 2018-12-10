package io.altar.jeeproject.DTO;

import java.util.List;

import io.altar.jeeproject.model.Entity;
import io.altar.jeeproject.model.Shelf;

public class ProductDTO extends Entity{
	
	private static final long serialVersionUID = 1L;
	
	private List<Shelf> shelves;
	private Long id;
	private int discountValue;
	private int iva;
	private int pvp;
	
	public ProductDTO(Long id, int discountValue, int iva, int pvp) {
		super();
		this.id = id;
		this.discountValue = discountValue;
		this.iva = iva;
		this.pvp = pvp;
		
	}

	public List<Shelf> getShelves() {
		return shelves;
	}

	public void setShelves(List<Shelf> shelves) {
		this.shelves = shelves;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getDiscountValue() {
		return discountValue;
	}

	public void setDiscountValue(int discountValue) {
		this.discountValue = discountValue;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public int getPvp() {
		return pvp;
	}

	public void setPvp(int pvp) {
		this.pvp = pvp;
	}
	
	
	
	
	
	
	
	
	
	

}
