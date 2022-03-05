package com.example.demo.service;

import java.util.List;



import com.example.demo.entity.Medicines;
import com.example.demo.exception.MedicinesNotFoundException;

public interface MedicinesService {
	List<Medicines> getAllMedicines();
	void saveMedicines(Medicines medicines);
	Medicines getMedicinesById(int id) throws MedicinesNotFoundException;
	void deleteMedicinesById(int id);
	

}
