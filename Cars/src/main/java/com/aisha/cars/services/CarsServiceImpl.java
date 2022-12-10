package com.aisha.cars.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aisha.cars.entities.Cars;
import com.aisha.cars.entities.Categorie;
import com.aisha.cars.repos.CarsRepository;
@Service
public class CarsServiceImpl implements CarsService {
	@Autowired
	CarsRepository CarsRepository;
	
	@Override
	public Cars saveCar(Cars c) {
		return CarsRepository.save(c);
	}

	@Override
	public Cars updateCar(Cars c) {
		return CarsRepository.save(c);

	}

	@Override
	public void deleteCar(Cars c) {
		CarsRepository.delete(c);		
	}

	@Override
	public void deleteCarById(Long id) {
		CarsRepository.deleteById(id);		
	}

	@Override
	public Cars getCar(Long id) {
		return CarsRepository.findById(id).get();
	}

	@Override
	public List<Cars> getAllCars() {
		return CarsRepository.findAll();
	}


	@Override
	public List<Cars> findByNomCarContains(String nom) {
		return CarsRepository.findByNomCarContains(nom);
	}

	@Override
	public List<Cars> findByNomCar(String nom) {
		return CarsRepository.findByNomCar(nom);
	}

	@Override
	public List<Cars> findByCategorie(Categorie categorie) {
		return CarsRepository.findByCategorie(categorie);	}

	@Override
	public List<Cars> findByCategorieIdCat(Long id) {
		return CarsRepository.findByCategorieIdCat(id);

	}

	@Override
	public List<Cars> findByOrderByNomCarAsc() {
		return CarsRepository.findByOrderByNomCarAsc();

	}

	@Override
	public List<Cars> findByNomPrix(String nom, Double prix) {
		return CarsRepository.findByNomPrix(nom, prix);
	}
	
	@Override
	public List<Cars> trierCarsNomsPrix() {
	return CarsRepository.trierCarsNomsPrix();
	}

	@Override
	public List<Cars> findByNomCar(String nom, Double prix) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
