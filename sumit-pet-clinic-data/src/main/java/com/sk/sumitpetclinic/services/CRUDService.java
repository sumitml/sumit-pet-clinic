package com.sk.sumitpetclinic.services;

import java.util.Set;

public interface CRUDService<T,ID> {
	
	public Set<T> findAll();
	
	public T findById(ID id);
	
	public T save(T object);
	
	public void delete(T object);
	
	public void deleteById(ID id);
	

}
