package io.altar.jeeproject.business;


import java.util.Collection;

import io.altar.jeeproject.model.Shelf;
import io.altar.jeeproject.repositories.ShelfRepository;



public class ShelfBusiness {
	private static ShelfRepository shelfRepository = ShelfRepository.getInstance();
	
	
	public Shelf createShelfBusiness(Shelf input) {
		return shelfRepository.save(input);
	}
	public Collection<Shelf> consultShelves() {
		return shelfRepository.getAll();
	}
	public Shelf consultShelfById(Long input) {
		return shelfRepository.findById(input);
	}
	
	public Shelf updateShelfById(Shelf shelf) {
		return shelfRepository.update(shelf);
	}
	
	public void deleteShelfById(Long input){
		shelfRepository.removeById(input);
	}
}

