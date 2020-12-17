package com.hackaton.microservicio1.backend.model;

public class Seguro {
	
	private String nombre;
	private double precio;
	private String descripcion;
	private Integer duracion;
	private Tipo tipo;
	
	
	public Seguro() {
		
	}


	public Seguro(String nombre, double precio, String descripcion, Integer duracion, Tipo tipo) {
		
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
		this.duracion = duracion;
		this.tipo = tipo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Integer getDuracion() {
		return duracion;
	}


	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}


	public Tipo getTipo() {
		return tipo;
	}


	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		return "Seguro [nombre=" + nombre + ", precio=" + precio + ", descripcion=" + descripcion + ", duracion="
				+ duracion + ", tipo=" + tipo + "]";
	}
	
	

}
