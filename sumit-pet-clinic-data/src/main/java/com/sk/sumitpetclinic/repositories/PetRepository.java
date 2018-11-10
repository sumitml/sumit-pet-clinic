package com.sk.sumitpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sk.sumitpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
