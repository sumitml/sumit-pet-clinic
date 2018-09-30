package com.sk.sumitpetclinic.services;


import com.sk.sumitpetclinic.model.Owner;

public interface OwnerService extends CRUDService<Owner, Long>{
	
	Owner findByLastName(String lastName);
	
}
