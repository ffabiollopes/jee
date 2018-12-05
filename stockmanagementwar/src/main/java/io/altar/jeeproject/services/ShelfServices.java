package io.altar.jeeproject.services;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.altar.jeeproject.business.ShelfBusiness;
import io.altar.jeeproject.model.Shelf;

@Path("shelf")
public class ShelfServices {

	ShelfBusiness shelfBusiness = new ShelfBusiness();

	@POST
	@Path("add")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Shelf createShelfServices(Shelf input) {
		
		return shelfBusiness.createShelfBusiness(input);
	}
	@GET
	@Path("list")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Shelf> consultShelvesServices() {
			return shelfBusiness.consultShelves();
	}
	
	@GET
	@Path("{id}")
	@Produces("Application/Json")
	public Shelf consultShelfByIdServices(@PathParam("id") Long id) {
			return shelfBusiness.consultShelfById(id);
	}
	
	@DELETE
	@Path("delete/{id}")
	@Produces("text/plain")
	public String deleteShelfServices(@PathParam("id") Long id) {
		shelfBusiness.deleteShelfById(id);
		return "Shelf Deleted";
	}
	@PUT
	@Path("update/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String updateProductById(@PathParam("id") Long id, Shelf input) {
		shelfBusiness.updateShelfById(input);
		return "Product Updated";
	}

}
