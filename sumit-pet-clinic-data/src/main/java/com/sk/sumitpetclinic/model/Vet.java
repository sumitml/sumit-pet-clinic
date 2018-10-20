package com.sk.sumitpetclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * @author SM114496
 *
 */
public class Vet extends Person {
	
	private Set<Speciality> specialities = new HashSet<>();

	public Set<Speciality> getSpecialities() {
		return specialities;
	}

	public void setSpecialities(Set<Speciality> specialities) {
		this.specialities = specialities;
	}
	
	

}
