package com.aisha.cars.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aisha.cars.entities.Cars;
import com.aisha.cars.services.CarsService;

@RestController
@RequestMapping ("/api")
@CrossOrigin 
public class CarsRESTController {
	@Autowired
	CarsService carsService;
	
	@RequestMapping(method=RequestMethod.GET)
	List <Cars> getAllCars(){
		return carsService.getAllCars();
		
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Cars getProduitById(@PathVariable("id") Long id) {
	return carsService.getCar(id);
	 }
	
	@RequestMapping(method = RequestMethod.POST)
	public Cars createProduit(@RequestBody Cars cars) {
	return carsService.saveCar(cars);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Cars updateProduit(@RequestBody Cars cars) {
	return carsService.updateCar(cars);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteCar(@PathVariable("id") Long id)
	{
	carsService.deleteCarById(id);
	}

	@RequestMapping(value="/carscat/{idCat}",method = RequestMethod.GET)
	public List<Cars> getProduitsByCatId(@PathVariable("idCat") Long idCat) {
	return carsService.findByCategorieIdCat(idCat);
	}
}
