package io.altar.jeeproject.business;


import io.altar.jeeproject.model.Shelf;
import io.altar.jeeproject.repositories.ShelfRepository;



public class ShelfBusiness {
	private static ShelfRepository shelfRepository = ShelfRepository.getInstance();
	
	
	public void createShelfBusiness(Shelf input) {
		shelfRepository.save(input);
	}
	public Shelf consultShelfById(Long input) {
		return shelfRepository.findById(input);
	}
	
	public void deleteShelfById(Long input){
		shelfRepository.removeById(input);
	}
}

