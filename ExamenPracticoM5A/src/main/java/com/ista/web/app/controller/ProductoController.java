package com.ista.web.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.ista.web.app.entity.Producto;
import com.ista.web.app.service.IProductoService;

@CrossOrigin(origins={"http://localhost:4200"})
@RestController
@RequestMapping("/api")

public class ProductoController {
	 @Autowired
		private IProductoService productoService;
		
		@GetMapping("/listarClientes")
		public List<Producto> index(){
			return productoService.findAll();
		}
		
		@PostMapping("/guardarCliente")
		@ResponseStatus (HttpStatus.CREATED)
		public Producto create(@RequestBody Producto producto){
			return productoService.save(producto);
		}
		
		@GetMapping("/buscarClientes/{id}")	
		public Producto show(@PathVariable Integer id) {
			return productoService.findById(id);
		}
		
		@DeleteMapping("/eliminarCliente/{id}")
		@ResponseStatus(HttpStatus.NO_CONTENT)
		public void delete(@PathVariable Integer id) {
			productoService.delete(id);
		}
		
		@PutMapping("/editarCliente/{id}")
		@ResponseStatus(HttpStatus.CREATED)
		public Producto update(@RequestBody Producto producto, @PathVariable Integer id) {
			Producto productoActual=productoService.findById(id);
			productoActual.setCantidad(producto.getCantidad());
			productoActual.setDescripcion(producto.getDescripcion());
			productoActual.setPrecio(producto.getPrecio());

			return productoService.save(productoActual);
		}
}
