package com.sk.sumitpetclinic.services.map;

import java.util.Set;

import com.sk.sumitpetclinic.model.Vet;
import com.sk.sumitpetclinic.services.CRUDService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CRUDService<Vet, Long> {

	@Override
	public Set<Vet> findAll(){
		return super.findAll();
	}
	
	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public Vet save(Vet object) {
		// TODO Auto-generated method stub
		return super.save(object.getId(),object);
	}
	@Override
	public void delete(Vet object) {
		super.delete(object);
	}
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}



}
