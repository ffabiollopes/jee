package io.altar.jeeproject.services;

import java.util.Collection;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import io.altar.jeeproject.business.ProductBusiness;
import io.altar.jeeproject.model.Product;


@Path("product")
public class ProductServices {
	//Variable used to connect with business level
	ProductBusiness productBusiness = new ProductBusiness();
	//POST method to add a product
	@POST
	@Path("add")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Product createProductServices(Product input) {
		return productBusiness.createProductBusiness(input);
	}
	//GET method to search a product
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Product consultProductByIdServices(@PathParam("id") Long id) {
			return productBusiness.consultProductById(id);
	}
	//GET method to get all products
	@GET
	@Path("list")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Product> consultProductsServices() {
			return productBusiness.consultProducts();
	}
	//GET method to search the shelves with a specific product
	@GET
	@Path("shelves/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Long> consultShelfofProduct(@PathParam("id") Long id) {
			return productBusiness.consultShelfProductById(id);
	}
	//DELETE method to delete a product by id
	@DELETE
	@Path("delete/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public String deleteProductServices(@PathParam("id") Long id) {
		productBusiness.deleteProductById(id);
		return "Product Deleted";
	}
	//PUT method to update a product
	@PUT
	@Path("update/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String updateProductById(@PathParam("id") Long id, Product input) {
		productBusiness.updateProductById(input);
		return "Product Updated";
	}
}
