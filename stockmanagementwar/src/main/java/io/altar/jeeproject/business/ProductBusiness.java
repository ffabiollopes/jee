package io.altar.jeeproject.business;


import io.altar.jeeproject.model.Product;
import io.altar.jeeproject.repositories.ProductRepository;



public class ProductBusiness {
	private static ProductRepository productRepository = ProductRepository.getInstance();
		
		public void createProductBusiness(Product input) {
			productRepository.save(input);
			
		}
		
		public Product consultProductById(Long input) {
			return productRepository.findById(input);
		}
		
		public void deleteProductById(Long input){
			productRepository.removeById(input);
		}
	}


