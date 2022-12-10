package com.aisha.cars.services;

import java.util.List;

import com.aisha.cars.entities.Cars;
import com.aisha.cars.entities.Categorie;

public interface CarsService {

	
	Cars saveCar(Cars c);
	Cars updateCar(Cars c);
	void deleteCar(Cars c);
	 void deleteCarById(Long id);
	Cars getCar(Long id);
	List<Cars> getAllCars();
	List<Cars> findByNomCar(String nom);
	List<Cars> findByNomCarContains(String nom);
	List<Cars> findByNomCar (String nom, Double prix);
	List<Cars> findByCategorie (Categorie categorie);
	List<Cars> findByCategorieIdCat(Long id);
	List<Cars> findByOrderByNomCarAsc();
	List<Cars> trierCarsNomsPrix();
	List<Cars> findByNomPrix(String nom, Double prix);
}
