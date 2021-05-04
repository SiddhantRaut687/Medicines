package com.medicines.service;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.medicines.dao.MedicineRepository;
import com.medicines.dao.OrderRepository;
import com.medicines.model.Medicine;
import com.medicines.model.Medico;
import com.medicines.model.Order;

@Service
public class CSVService {
	
	@Autowired
	MedicineRepository medRepo;
	
	@Autowired
	OrderRepository orderRepo;
	
	public void save(MultipartFile file) throws NumberFormatException, ParseException {
	    try {
	      ArrayList<Medico> medicos = CSVHelper.csvToMedicines(file.getInputStream());
	      for(Medico medico:medicos)  
			{  
				Medicine medicine = new Medicine();
				medicine.setBalanceQuantity(medico.getBalanceQuantity());
				medicine.setBatchNumber(medico.getBatchNumber());
				medicine.setExpiryDate(medico.getExpiryDate());
				medicine.setHsnCode(medico.getHsnCode());
				medicine.setManufacturer(medico.getManufacturer());
				medicine.setMrp(medico.getMrp());
				medicine.setName(medico.getName());
				medicine.setPackaging(medico.getPackaging());
				medicine.setSchemas(medico.getSchemas());
				medicine.setUniqueCode(medico.getUniqueCode());
			    medRepo.save(medicine);
			}
	    } catch (IOException e) {
	      throw new RuntimeException("fail to store csv data: " + e.getMessage());
	    }
	  }
	
	public ArrayList<Medicine> getByUniqueId(String uniqueId){
		return medRepo.findByUniqueCode(uniqueId);
	}
	
	public ArrayList<Medicine> getByNameContaining(String key){
		return medRepo.findByNameContains(key);
	}
	
	public Medicine getByUniqueCodeAndName(String uniqueCode, String name) {
		return medRepo.findByUniqueCodeAndName(uniqueCode, name);
	}
	
	public int placeOrder(Order order) {
		return orderRepo.save(order).getOrderId();
	}
	
}
