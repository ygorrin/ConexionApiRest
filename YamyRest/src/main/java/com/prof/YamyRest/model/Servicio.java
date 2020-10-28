package com.prof.YamyRest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Servicio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idServicio;
	private String nombreServicio;
	private String precioServicio;
	
	public int getIdServicio() {
		return idServicio;
	}
	public void setIdServicio(int idServicio) {
		this.idServicio = idServicio;
	}
	public String getNombreServicio() {
		return nombreServicio;
	}
	public void setNombreServicio(String nombreServicio) {
		this.nombreServicio = nombreServicio;
	}
	public String getPrecioServicio() {
		return precioServicio;
	}
	public void setPrecioServicio(String precioServicio) {
		this.precioServicio = precioServicio;
	}

	
}
