package com.aisha.cars.entities;

import org.springframework.data.rest.core.config.Projection;
@Projection(name = "nomCar", types = { Cars.class })
public interface ProduitProjection {
public String getNomCar();
}