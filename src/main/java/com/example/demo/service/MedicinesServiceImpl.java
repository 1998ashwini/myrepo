package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Medicines;
import com.example.demo.exception.MedicinesNotFoundException;
import com.example.demo.repository.MedicinesRepository;

@Service
public class MedicinesServiceImpl implements MedicinesService{
	@Autowired
	private MedicinesRepository medicinesrepository;

	public List<Medicines> getAllMedicines() {
		// TODO Auto-generated method stub
		return medicinesrepository.findAll();
	}
	
	@Override
	public void saveMedicines(Medicines medicines) {
		this.medicinesrepository.save(medicines);
		
	}

	@Override
	public Medicines getMedicinesById(int medicine_id) throws MedicinesNotFoundException {
		Optional<Medicines> optional = medicinesrepository.findById(medicine_id);
		Medicines medicines = null;
		if(optional.isPresent()) {
			medicines = optional.get();
		}else {
			throw new MedicinesNotFoundException("Book not found for id:: " + medicine_id);
		}
		return medicines;
	}

	@Override
	public void deleteMedicinesById(int medicines_id) {
		this.medicinesrepository.deleteById(medicines_id);
		
	}
	
	
	
	

}
