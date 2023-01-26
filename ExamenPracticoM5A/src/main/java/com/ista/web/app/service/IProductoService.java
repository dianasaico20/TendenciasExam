package com.ista.web.app.service;

import java.util.List;

import com.ista.web.app.entity.Producto;

public interface IProductoService {
	public List<Producto> findAll();
	
	public Producto save(Producto producto);
	
	public Producto findById(Integer id);
	
	public void delete(Integer id);
}
