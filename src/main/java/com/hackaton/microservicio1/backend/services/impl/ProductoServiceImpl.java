package com.hackaton.microservicio1.backend.services.impl;

import org.springframework.stereotype.Service;

import com.hackaton.microservicio1.backend.model.Categoria;
import com.hackaton.microservicio1.backend.model.Producto;
import com.hackaton.microservicio1.backend.model.Seguro;
import com.hackaton.microservicio1.backend.model.Tipo;
import com.hackaton.microservicio1.backend.services.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {

	private Categoria[] categorias = new Categoria[9];

	@Override
	public void asegurable(Producto producto) {

		this.categorias[0] = new Categoria("Electronica", "patinetes");
		this.categorias[1] = new Categoria("Electronica", "mobiles");
		this.categorias[2] = new Categoria("Electronica", "laptops");
		this.categorias[3] = new Categoria("Electronica", "drones");
		this.categorias[4] = new Categoria("Electronica", "otros");
		this.categorias[5] = new Categoria("Electrodomesticos", "refrigeradores");
		this.categorias[6] = new Categoria("Electrodomesticos", "aspiradoras");
		this.categorias[7] = new Categoria("Utensilios", "gadgets");
		this.categorias[8] = new Categoria("Otros", "Otros");
		
		
		

		for (Categoria cat : categorias) {
			if (producto.getPrecio() > 40 && producto.getCategoria().toString().equals(cat.toString())) {
				producto.setAsegurable(true);
				break;
			} else {
				producto.setAsegurable(false);
			}
		}

	}

	@Override
	public Seguro[] creaSeguro(Producto producto) {

		final Seguro[] seguros = new Seguro[3];
		Seguro seguro1 = new Seguro("Cobertura seguro 1 año", 1.00, "Seguro óptimo para tu articulo", 1,
				Tipo.ROBO);
		Seguro seguro2 = new Seguro("Cobertura seguro 1 año", 1.00, "Seguro óptimo para tu articulo", 1,
				Tipo.ROTURA);
		Seguro seguro3 = new Seguro("Cobertura seguro 1 año", 1.00, "Seguro óptimo para tu articulo", 1,
				Tipo.TODO_RIESGO);

		asegurable(producto);

		for (int i = 0; i <= seguros.length - 1; i++) {
			if (producto.isAsegurable() && producto.getPrecio() <= 100) {

				seguro1.setPrecio(producto.getPrecio() * 0.1);
				seguro2.setPrecio(producto.getPrecio() * 0.15);
				seguro3.setPrecio(producto.getPrecio() * 0.25);
				seguros[0] = seguro1;
				seguros[1] = seguro2;
				seguros[2] = seguro3;

			} else if (producto.isAsegurable() && producto.getPrecio() > 100 && producto.getPrecio() < 500) {

				seguro1.setPrecio(producto.getPrecio() * 0.1);
				seguro2.setPrecio(producto.getPrecio() * 0.15);
				seguro3.setPrecio(producto.getPrecio() * 0.25);
				seguros[0] = seguro1;
				seguros[1] = seguro2;
				seguros[2] = seguro3;

			} else if (producto.isAsegurable() && producto.getPrecio() > 500) {

				seguro1.setPrecio(producto.getPrecio() * 0.1);
				seguro2.setPrecio(producto.getPrecio() * 0.12);
				seguro3.setPrecio(producto.getPrecio() * 0.2);
				seguros[0] = seguro1;
				seguros[1] = seguro2;
				seguros[2] = seguro3;
			}
		}
		return seguros;
	}

}
