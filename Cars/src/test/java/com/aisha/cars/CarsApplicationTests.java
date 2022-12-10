package com.aisha.cars;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.aisha.cars.entities.Cars;
import com.aisha.cars.entities.Categorie;
import com.aisha.cars.repos.CarsRepository;

@SpringBootTest
class CarsApplicationTests {

	@Autowired
	private CarsRepository CarsRepository;
	@Test
	public void testCreateCar() {
	Cars car = new Cars(null, "BMW",150.000,new Date(), null);
	CarsRepository.save(car);
	}
	@Test
	public void testDeleteCar() {
	CarsRepository.deleteById(1L);
	}
	@Test
	public void testFindAllCar() {
		List<Cars> cars = CarsRepository.findAll() ;
		for (Cars c:cars)
			System.out.println(c);
	
	}
	@Test
	public void testFindCarByNom() {
		List<Cars> cars = CarsRepository.findByNomCar("BMX") ;
		for (Cars c:cars)
			System.out.println(c);
	
	}
	@Test
	public void testFindByNomCarContains ()
	{
	List<Cars> cars=CarsRepository.findByNomCarContains("");
	for (Cars c:cars)
		System.out.println(c);
 }
	@Test
	public void testfindByNomPrix()
	{
	List<Cars> cars = CarsRepository.findByNomPrix("Opel",80.000);
	for (Cars c: cars)
	System.out.println(c);
	}

	@Test
	public void testfindByCategorie()
	{
	Categorie cat = new Categorie();
	cat.setIdCat(1L);
	List <Cars> cars=CarsRepository.findByCategorie(cat);
	for (Cars c:cars)
	System.out.println(c);
	}
	
	@Test
	public void testfindByCategorieIdCat()
	{
	List <Cars> cars=CarsRepository.findByCategorieIdCat(1L);
	for (Cars c:cars)
	System.out.println(c);}
	
	
	@Test
	public void testfindByOrderByNomCarAsc()
	{
	List <Cars> cars=
			CarsRepository.findByOrderByNomCarAsc();
	for (Cars c:cars)
	System.out.println(c);
	}
	
	@Test
	public void testTrierCarsNomsPrix()
	{
	List<Cars> cars = CarsRepository.trierCarsNomsPrix();
	for (Cars c : cars)
	{
	System.out.println(c);
	}
	}
	
	
	
}


