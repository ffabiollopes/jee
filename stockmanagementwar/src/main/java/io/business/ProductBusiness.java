package io.altar.jeeproject.business;


import java.util.Collection;
import java.util.List;

import io.altar.jeeproject.DTO.ProductDTO;
import io.altar.jeeproject.DTO.ShelfDTO;
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
		
		public ProductDTO consultProductById(Long input) {
			Product product = productRepository.findById(input);
			ProductDTO productDTO = new ProductDTO(product.getId(),product.getDiscountValue(),product.getIva(),product.getPvp());	
			return productDTO;
		}
		
		public void deleteProductById(Long input){
			productRepository.removeById(input);
		}
		
		public Product updateProductById(Product product) {
			return productRepository.update(product);
		}
		
		public List<ShelfDTO> consultShelfProductById(Long input) {
			List<ShelfDTO> listReturn = null;
			
			List<Shelf> listOfShelves = productRepository.findById(input).getShelves();
			for (Shelf id : listOfShelves) 
			{ 
				ShelfDTO shelfDTO = new ShelfDTO(id.getId());
			    listReturn.add(shelfDTO);
			}
			return listReturn;
		}
	}


