package com.aisha.cars.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
public class Categorie {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idCat;
	private String nomCat;
	private String descriptionCat;
	
	@OneToMany (mappedBy = "categorie")
	@JsonIgnore
	private List<Cars> carss;

	public Long getIdCat() {
		return idCat;
	}

	public Categorie(Long idCat, String nomCat, String descriptionCat, List<Cars> carss) {
		super();
		this.idCat = idCat;
		this.nomCat = nomCat;
		this.descriptionCat = descriptionCat;
		this.carss = carss;
	}

	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setIdCat(Long idCat) {
		this.idCat = idCat;
	}

	public String getNomCat() {
		return nomCat;
	}

	public void setNomCat(String nomCat) {
		this.nomCat = nomCat;
	}

	public String getDescriptionCat() {
		return descriptionCat;
	}

	public void setDescriptionCat(String descriptionCat) {
		this.descriptionCat = descriptionCat;
	}

	public List<Cars> getCarss() {
		return carss;
	}

	public void setCarss(List<Cars> carss) {
		this.carss = carss;
	}

	
	
	

}
