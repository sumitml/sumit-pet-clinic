package com.sk.sumitpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sk.sumitpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}
