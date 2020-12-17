package com.hackaton.microservicio1.backend.services;

import com.hackaton.microservicio1.backend.model.Producto;
import com.hackaton.microservicio1.backend.model.Seguro;

public interface ProductoService {
	
	public void asegurable(Producto producto);
	public Seguro[] creaSeguro(Producto producto);
	
}
