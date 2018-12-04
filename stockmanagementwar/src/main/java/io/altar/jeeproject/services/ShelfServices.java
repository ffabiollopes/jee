package io.altar.jeeproject.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import io.altar.jeeproject.business.ShelfBusiness;
import io.altar.jeeproject.model.Shelf;

@Path("shelf")
public class ShelfServices {

	ShelfBusiness shelfBusiness = new ShelfBusiness();

	@POST
	@Path("add")
	@Consumes("Application/Json")
	@Produces("Application/Json")
	public String createShelfServices(Shelf input) {
		shelfBusiness.createShelfBusiness(input);
		return "OK";
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

}
