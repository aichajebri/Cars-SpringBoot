package com.aisha.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.aisha.cars.entities.Cars;
import com.aisha.cars.entities.Categorie;

@SpringBootApplication
public class CarsApplication implements CommandLineRunner  {
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	public static void main(String[] args) {
	SpringApplication.run(CarsApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repositoryRestConfiguration.exposeIdsFor(Cars.class , Categorie.class);
		
	}
	

}
