package io.altar.jeeproject.model;

import java.io.Serializable;

public class Entity implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long Id;

	/**
	 * @return the id
	 */
	public Long getId() {
		return Id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		Id = id;
	}

	@Override
	public String toString() {
		return "Entity Id:" + Id;
	}

}
