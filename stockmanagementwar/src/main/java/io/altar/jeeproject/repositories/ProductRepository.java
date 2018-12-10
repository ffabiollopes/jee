package io.altar.jeeproject.repositories;

import io.altar.jeeproject.model.Product;

//SINGLETON - Only one Instance of Product
public class ProductRepository extends EntityRepository <Product>{
	
	//variable INSTANCE is ProductRepository()
	private static final ProductRepository INSTANCE = new ProductRepository();
	  
	//constructor Private - this way no ones can create new
  private ProductRepository() {        
  }
  
	//Method to Instance Product to return the INSTANCE 
  public static ProductRepository getInstance() {
      
      return INSTANCE;
  }

}
