package com.sk.sumitpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.sk.sumitpetclinic.model.Owner;
import com.sk.sumitpetclinic.model.Pet;
import com.sk.sumitpetclinic.services.CRUDService;
import com.sk.sumitpetclinic.services.OwnerService;
import com.sk.sumitpetclinic.services.PetService;
import com.sk.sumitpetclinic.services.PetTypeService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

	private final PetTypeService petTypeService;
	private final PetService petService;
	
	
	public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
		super();
		this.petTypeService = petTypeService;
		this.petService = petService;
	}

	@Override
	public Set<Owner> findAll(){
		return super.findAll();
	}
	
	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public Owner save(Owner object) {
		// TODO Auto-generated method stub
		
		if(object != null){
			if(object.getPetSet() != null) {
				object.getPetSet().forEach(pet ->{
					if(pet.getPetType() != null) {
						if(pet.getPetType().getId() == null) {
							pet.setPetType(petTypeService.save(pet.getPetType()));
						}
					}else {
						throw new RuntimeException("Pet Type is required");
					}
					
					if(pet.getId() == null) {
						Pet savedPet = petService.save(pet);
						pet.setId(savedPet.getId());
					}
				});
			}
			return super.save(object);
		}else {
			return null;
		}
		
	}
	@Override
	public void delete(Owner object) {
		super.delete(object);
	}
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}


	

}
