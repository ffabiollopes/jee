package io.altar.jeeproject.repositories;

import io.altar.jeeproject.model.Shelf;

//SINGLETON - Only one Instance of Shelves
public class ShelfRepository extends EntityRepository <Shelf> {
	
	//variable INSTANCE is ShelfRepository()
	private static final ShelfRepository INSTANCE = new ShelfRepository();
	
  //constructor 
  private ShelfRepository() {        
  }
  
  //Method to Instance Shelf to return the INSTANCE
  public static ShelfRepository getInstance() {
      
      return INSTANCE;
  }

}
