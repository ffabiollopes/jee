package io.altar.jeeproject.repositories;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import io.altar.jeeproject.model.Entity;


public class EntityRepository <T extends Entity> {
	// Singleton Instance of ProductRepository and shelfRepository
			
			
	
	//initialize variables
	private long actualId = 0;
	private Map<Long, T> map = new HashMap<Long, T>();
	
	//Method to create Products/Shelves and give an automatic id
	public T save(T entity) {
		entity.setId(actualId);
		map.put(entity.getId(), entity);
		actualId++;
		return entity;
	}
	
	//Method to save a shelf on Product creation
	public void saveMyId(T entity, Long id) {
		entity.setId(id);
		map.put(entity.getId(), entity);
	}
	
	//Method to Find Products/Shelves by id
	public T findById(Long id) {
		return map.get(id);
	}
	
	//Method to remove Products/Shelves by id
	public void removeById(Long id) {
		map.remove(id);
	}
	
	//Method to get all Products/Shelves
	public Collection<T> getAll() {
		return map.values();
	}
	
	//Method to update all Products/Shelves
	public T update(T entity) {
		map.replace(entity.getId(), entity);
		return entity;
	}
}

