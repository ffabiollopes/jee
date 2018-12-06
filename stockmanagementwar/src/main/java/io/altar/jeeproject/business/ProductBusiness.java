package io.altar.jeeproject.business;


import java.util.Collection;
import java.util.List;

import io.altar.jeeproject.model.Product;
import io.altar.jeeproject.model.Shelf;
import io.altar.jeeproject.repositories.ProductRepository;



public class ProductBusiness {
	private static ProductRepository productRepository = ProductRepository.getInstance();
		
		public Product createProductBusiness(Product input) {
			return productRepository.save(input);
			
		}
		public Collection<Product> consultProducts() {
			
			return productRepository.getAll();
		}
		
		public Product consultProductById(Long input) {
			return productRepository.findById(input);
		}
		
		public void deleteProductById(Long input){
			productRepository.removeById(input);
		}
		
		public Product updateProductById(Product product) {
			return productRepository.update(product);
		}
		
		public List<Long> consultShelfProductById(Long input) {
			List<Long> list = productRepository.findById(input).getShelves();
			return list;
		}
	}


