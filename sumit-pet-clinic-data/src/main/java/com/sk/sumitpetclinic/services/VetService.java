package com.sk.sumitpetclinic.services;

import java.util.Set;

import com.sk.sumitpetclinic.model.Vet;

public interface VetService {
	
Vet findById(Long id);
	
	Vet save(Vet vet);
	
	Set<Vet> findAll();

}
