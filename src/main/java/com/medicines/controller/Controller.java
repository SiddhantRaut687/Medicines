package com.medicines.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.medicines.model.Medicine;
import com.medicines.model.Order;
import com.medicines.model.OrderRequest;
import com.medicines.service.CSVHelper;
import com.medicines.service.CSVService;

@RestController
public class Controller {
	
	@Autowired
	CSVService csvService;
	
	@RequestMapping(value = "/uploadCSV", method = RequestMethod.POST)
	public String uploadMedicines(@RequestParam("file") MultipartFile file) {
		if (CSVHelper.hasCSVFormat(file)) {
		    try {
		         csvService.save(file);
		         return "Upload Successful";
		    } catch (Exception e) {
		         return "Upload Failed: "+e.getMessage();
		    }
		}
		else {
			return "Please upload a csv file";
		}
	}
	
	@RequestMapping(value = "/getMedicineDetails", method = RequestMethod.GET)
	public ArrayList<Medicine> getDetails(@RequestParam("uniqueCode") String uniqueCode){
		return csvService.getByUniqueId(uniqueCode);
	}
	
	@RequestMapping(value = "/searchMedicine", method = RequestMethod.GET)
	public ArrayList<Medicine> getMedicinesLike(@RequestParam("key") String key){
		return csvService.getByNameContaining(key);
	}
	
	@RequestMapping(value = "/placeorder", method = RequestMethod.POST)
	public int placeOrder(@RequestBody OrderRequest order) {
		Medicine medicine = csvService.getByUniqueCodeAndName(order.getUniqueCode(), order.getName());
		if(medicine.getBalanceQuantity()<order.getQuantity())return -1;
		return csvService.placeOrder(new Order(order.getUniqueCode(), order.getQuantity(), order.getName()));
	}
	
}
