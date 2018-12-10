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
	//Variable used to connect with business level
	ShelfBusiness shelfBusiness = new ShelfBusiness();

	//POST method to add a shelf
	@POST
	@Path("add")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Shelf createShelfServices(Shelf input) {
		return shelfBusiness.createShelfBusiness(input);
	}
	//GET method to list all shelves
	@GET
	@Path("list")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Shelf> consultShelvesServices() {
			return shelfBusiness.consultShelves();
	}
	//GET method to search a shelf by id
	@GET
	@Path("{id}")
	@Produces("Application/Json")
	public Shelf consultShelfByIdServices(@PathParam("id") Long id) {
			return shelfBusiness.consultShelfById(id);
	}
	//DELETE method to delete a shelf by id
	@DELETE
	@Path("delete/{id}")
	@Produces("text/plain")
	public String deleteShelfServices(@PathParam("id") Long id) {
		shelfBusiness.deleteShelfById(id);
		return "Shelf Deleted";
	}
	//PUT method to update a shelf
	@PUT
	@Path("update/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String updateProductById(@PathParam("id") Long id, Shelf input) {
		shelfBusiness.updateShelfById(input);
		return "Product Updated";
	}
}
