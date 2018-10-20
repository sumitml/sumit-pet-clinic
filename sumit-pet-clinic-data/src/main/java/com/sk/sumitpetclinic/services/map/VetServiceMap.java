package com.sk.sumitpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.sk.sumitpetclinic.model.Speciality;
import com.sk.sumitpetclinic.model.Vet;
import com.sk.sumitpetclinic.services.SpecialitiesService;
import com.sk.sumitpetclinic.services.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

	private final SpecialitiesService specialityService;
	
	
	public VetServiceMap(SpecialitiesService specialityService) {
		super();
		this.specialityService = specialityService;
	}

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
		if(object.getSpecialities().size() > 0) {
			object.getSpecialities().forEach(speciality -> {
				if(speciality.getId() == null) {
					Speciality savedSpeciality = specialityService.save(speciality);
					speciality.setId(savedSpeciality.getId());
				}
			});
		}
		return super.save(object);
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
