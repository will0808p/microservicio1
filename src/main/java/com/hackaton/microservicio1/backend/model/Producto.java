package com.hackaton.microservicio1.backend.model;

import java.io.Serializable;



public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	private String nombre;
	
	
	private Integer id;
	
	private double precio;
	
	private Categoria categoria;
	
	private boolean asegurable;
	
	
	public Producto() {
	
	}


	public Producto(String nombre, Integer id, double precio, Categoria categoria, boolean asegurable) {
	
		this.nombre = nombre;
		this.id = id;
		this.precio = precio;
		this.categoria = categoria;
		this.asegurable = asegurable;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	public boolean isAsegurable() {
		return asegurable;
	}


	public void setAsegurable(boolean asegurable) {
		this.asegurable = asegurable;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", id=" + id + ", precio=" + precio + ", categoria=" + categoria
				+ ", asegurable=" + asegurable + "]";
	}
	
	

		

	}