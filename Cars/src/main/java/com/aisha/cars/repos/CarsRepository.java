package com.aisha.cars.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.aisha.cars.entities.Cars;
import com.aisha.cars.entities.Categorie;
@RepositoryRestResource(path = "rest")
public interface CarsRepository extends JpaRepository<Cars, Long> {

	List<Cars> findByNomCar(String nom);
	 List<Cars> findByNomCarContains(String nom); 
	
	
	@Query("select c from Cars c where c.nomCar like %?1 and c.prixCar >= ?2")
	List<Cars> findByNomPrix (String nom, Double prix);
	//@Query("select c from Cars c where c.nomCar like %:nom and c.prixCar = :prix")
	//List<Cars> findByNomPrix (@Param("nom") String nom,@Param("prix") double d);
	
	@Query ("select c from Cars c where c.categorie =?1")
	List <Cars> findByCategorie (Categorie categorie);
	
	List <Cars> findByCategorieIdCat(Long id);
	
	List <Cars> findByOrderByNomCarAsc();
	
	@Query("select c from Cars c order by c.nomCar ASC, c.prixCar DESC")
	List<Cars> trierCarsNomsPrix ();

	

	

	}

	