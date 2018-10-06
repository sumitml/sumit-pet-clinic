package com.sk.sumitpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.sk.sumitpetclinic.model.Pet;
import com.sk.sumitpetclinic.services.CRUDService;
import com.sk.sumitpetclinic.services.PetService;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

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
