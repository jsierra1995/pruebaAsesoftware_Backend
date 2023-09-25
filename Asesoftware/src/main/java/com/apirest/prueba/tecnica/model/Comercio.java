package com.apirest.prueba.tecnica.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Comercio {
    @Id
    private Long idComercio;
    private String nomComercio;
    private int aforoMaximo;
	public String getNomComercio() {
		return nomComercio;
	}
	public void setNomComercio(String nomComercio) {
		this.nomComercio = nomComercio;
	}
	public int getAforoMaximo() {
		return aforoMaximo;
	}
	public void setAforoMaximo(int aforoMaximo) {
		this.aforoMaximo = aforoMaximo;
	}
	public Long getIdComercio() {
		return idComercio;
	}
	public void setIdComercio(Long idComercio) {
		this.idComercio = idComercio;
	}

    // Getters y Setters
}