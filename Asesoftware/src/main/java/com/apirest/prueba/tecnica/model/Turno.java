package com.apirest.prueba.tecnica.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Turno {
    @Id
    private Long idTurno;
    private LocalDate fechaTurno;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private String estado;

    public Long getIdTurno() {
		return idTurno;
	}

	public void setIdTurno(Long idTurno) {
		this.idTurno = idTurno;
	}

	public LocalDate getFechaTurno() {
		return fechaTurno;
	}

	public void setFechaTurno(LocalDate fechaTurno) {
		this.fechaTurno = fechaTurno;
	}

	public LocalTime getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}

	public LocalTime getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(LocalTime horaFin) {
		this.horaFin = horaFin;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Servicio getServicio() {
		return servicio;	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	@ManyToOne
    private Servicio servicio;

    // Getters y Setters
}
