package com.medicines.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicines.model.Medicine;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Integer> {

	ArrayList<Medicine> findByUniqueCode(String uniqueCode);
	
	ArrayList<Medicine> findByNameContains(String name);
	
	Medicine findByUniqueCodeAndName(String uniqueCode, String name);
}
