package com.hackaton.microservicio1.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackaton.microservicio1.backend.model.Producto;
import com.hackaton.microservicio1.backend.model.Seguro;
import com.hackaton.microservicio1.backend.services.ProductoService;

@RestController
@CrossOrigin
@RequestMapping("/producto")
public class ProductoController {

	@Autowired
	private ProductoService productoService;

	@PostMapping
	public Seguro[] asegurar(@RequestBody Producto producto) {
		return productoService.creaSeguro(producto);
	}
}
