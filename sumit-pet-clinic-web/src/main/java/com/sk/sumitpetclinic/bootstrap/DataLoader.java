package com.sk.sumitpetclinic.bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sk.sumitpetclinic.model.Owner;
import com.sk.sumitpetclinic.model.Pet;
import com.sk.sumitpetclinic.model.PetType;
import com.sk.sumitpetclinic.model.Speciality;
import com.sk.sumitpetclinic.model.Vet;
import com.sk.sumitpetclinic.model.Visit;
import com.sk.sumitpetclinic.services.OwnerService;
import com.sk.sumitpetclinic.services.PetTypeService;
import com.sk.sumitpetclinic.services.SpecialitiesService;
import com.sk.sumitpetclinic.services.VetService;
import com.sk.sumitpetclinic.services.VisitService;
import com.sk.sumitpetclinic.services.map.OwnerServiceMap;
import com.sk.sumitpetclinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner{

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	private final SpecialitiesService specialityService;
	private final VisitService visitService;
	
	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService,
			SpecialitiesService specialityService, VisitService visitService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
		this.specialityService = specialityService;
		this.visitService = visitService;
	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		int count = petTypeService.findAll().size();
		if(count == 0) {
		loadData();
		}
	}


	private void loadData() {
		PetType dog = new PetType();
		dog.setName("Dog");
		PetType savedDogPetType = petTypeService.save(dog);
		
		PetType cat = new PetType();
		cat.setName("Cat");
		PetType savedCatPetType = petTypeService.save(cat);
		
		Speciality radiology = new Speciality();
		radiology.setDescription("Radiology");
		Speciality savedRadiology = specialityService.save(radiology);
		
		Speciality surgery = new Speciality();
		radiology.setDescription("Surgery");
		Speciality savedSurgery = specialityService.save(surgery);
		
		Speciality dentistry = new Speciality();
		radiology.setDescription("Dentistry");
		Speciality savedDentistry = specialityService.save(dentistry);
		
		Owner owner1 = new Owner();
		
		owner1.setFirstName("Michael");
		owner1.setLastName("Weston");
		owner1.setAddress("123 ivory");
		owner1.setCity("bangalore");
		owner1.setTelephone("123456");
		
	
		Pet mikePet = new Pet();
		mikePet.setPetType(savedDogPetType);
		mikePet.setOwner(owner1);
		mikePet.setBirthDate(LocalDate.now());
		mikePet.setName("Neo");
		owner1.getPetSet().add(mikePet);
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		
		owner2.setFirstName("SK");
		owner2.setLastName("M");
		owner2.setAddress("903 ivory");
		owner2.setCity("bangalore");
		owner2.setTelephone("7890");
		Pet skPet = new Pet();
		skPet.setPetType(savedCatPetType);
		skPet.setOwner(owner1);
		skPet.setBirthDate(LocalDate.now());
		skPet.setName("Roomie");
		owner1.getPetSet().add(skPet);
		ownerService.save(owner2);
		
		System.out.println("Loaded Owners");
		
		Visit visit = new Visit();
	//	visit.setPet(skPet);
		visit.setDate(LocalDate.now());
		visit.setDescription("sneezy");
		visitService.save(visit);
		
		Vet vet1 = new Vet();
		
		vet1.setFirstName("snig");
		vet1.setLastName("M");
		vet1.getSpecialities().add(savedRadiology);
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		
		vet2.setFirstName("P");
		vet2.setLastName("M");
		vet2.getSpecialities().add(savedSurgery);
		vetService.save(vet2);
		
		System.out.println("Loaded Vets");
	}

}
