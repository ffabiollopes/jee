package io.altar.jeeproject.business;


import java.util.Collection;
import java.util.List;

import io.altar.jeeproject.model.Product;
import io.altar.jeeproject.repositories.ProductRepository;



/**
 * Product Business level
 *
 */
public class ProductBusiness {
	//Singleton Instance of productRepository
	private static ProductRepository productRepository = ProductRepository.getInstance();
		
	 	//method to create a product
		public Product createProductBusiness(Product input) {
			return productRepository.save(input);
		}
		//method to see all products
		public Collection<Product> consultProducts() {
			return productRepository.getAll();
		}
		//method to see a product by id
		public Product consultProductById(Long input) {
			return productRepository.findById(input);
		}
		//method to delete a product
		public void deleteProductById(Long input){
			productRepository.removeById(input);
		}
		//method to update a product
		public Product updateProductById(Product product) {
			return productRepository.update(product);
		}
		//method to search shelves with a specific product
		public List<Long> consultShelfProductById(Long input) {
			List<Long> list = productRepository.findById(input).getShelves();
			return list;
		}
	}


