package com.aisha.cars.entities;

import java.util.Date;



import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@jakarta.persistence.Entity
public class Cars {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idCar;
	private String nomCar;
	private Double prixCar;
	private Date dateCreation;

	@ManyToOne
	private Categorie categorie;

	public Cars() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cars(Long idCar, String nomCar, Double prixCar, Date dateCreation, Categorie categorie) {
		super();
		this.idCar = idCar;
		this.nomCar = nomCar;
		this.prixCar = prixCar;
		this.dateCreation = dateCreation;
		this.categorie = categorie;
	}

	public Long getIdCar() {
		return idCar;
	}

	public void setIdCar(Long idCar) {
		this.idCar = idCar;
	}

	public String getNomCar() {
		return nomCar;
	}

	public void setNomCar(String nomCar) {
		this.nomCar = nomCar;
	}

	public Double getPrixCar() {
		return prixCar;
	}

	public void setPrixCar(Double prixCar) {
		this.prixCar = prixCar;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	
	
	
	
}
