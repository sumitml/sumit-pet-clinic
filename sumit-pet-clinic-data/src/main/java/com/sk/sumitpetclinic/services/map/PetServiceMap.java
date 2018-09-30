package com.sk.sumitpetclinic.services.map;

import java.util.Set;

import com.sk.sumitpetclinic.model.Pet;
import com.sk.sumitpetclinic.services.CRUDService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CRUDService<Pet, Long> {

	@Override
	public Set<Pet> findAll(){
		return super.findAll();
	}
	
	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public Pet save(Pet object) {
		// TODO Auto-generated method stub
		return super.save(object.getId(),object);
	}
	@Override
	public void delete(Pet object) {
		super.delete(object);
	}
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}



}
