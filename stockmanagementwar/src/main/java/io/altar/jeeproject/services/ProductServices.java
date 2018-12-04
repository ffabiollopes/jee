package io.altar.jeeproject.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import io.altar.jeeproject.business.ProductBusiness;
import io.altar.jeeproject.model.Product;

@Path("product")
public class ProductServices {

	ProductBusiness productBusiness = new ProductBusiness();

	@POST
	@Path("add")
	@Consumes("Application/Json")
	@Produces("Application/Json")
	public String createProductServices(Product input) {
		productBusiness.createProductBusiness(input);
		return "OK";
	}

	@GET
	@Path("{id}")
	@Produces("Application/Json")
	public Product consultProductByIdServices(@PathParam("id") Long id) {
			return productBusiness.consultProductById(id);
	}
	
	@DELETE
	@Path("delete/{id}")
	@Produces("text/plain")
	public String deleteProductServices(@PathParam("id") Long id) {
		productBusiness.deleteProductById(id);
		return "Product Deleted";
	}
	
}
