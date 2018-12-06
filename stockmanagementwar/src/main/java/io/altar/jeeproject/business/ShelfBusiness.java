package io.altar.jeeproject.business;

import java.util.Collection;
import io.altar.jeeproject.model.Shelf;
import io.altar.jeeproject.repositories.ShelfRepository;



/**
 * Shelf Business level
 *
 */
public class ShelfBusiness {
	//Singleton Instance of shelfRepository
	private static ShelfRepository shelfRepository = ShelfRepository.getInstance();
	
	//method to create a Shelf
	public Shelf createShelfBusiness(Shelf input) {
		return shelfRepository.save(input);
	}
	//method to see all products
	public Collection<Shelf> consultShelves() {
		return shelfRepository.getAll();
	}
	//method to see a Shelf by id
	public Shelf consultShelfById(Long input) {
		return shelfRepository.findById(input);
	}
	//method to update a Shelf
	public Shelf updateShelfById(Shelf shelf) {
		return shelfRepository.update(shelf);
	}
	//method to delete a Shelf
	public void deleteShelfById(Long input){
		shelfRepository.removeById(input);
	}
}

