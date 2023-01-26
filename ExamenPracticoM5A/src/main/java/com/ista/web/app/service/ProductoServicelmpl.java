package com.ista.web.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.web.app.entity.Producto;
import com.ista.web.app.repository.ProductoRepository;

@Service
public class ProductoServicelmpl implements IProductoService{
	@Autowired
	private ProductoRepository ProductoRepository;
	

	@Override
	@Transactional (readOnly =true)
	public List<Producto> findAll() {
		return (List<Producto>)ProductoRepository.findAll();
	}

	@Override
	public Producto save(Producto producto) {
		return ProductoRepository.save(producto);
	}

	@Override
	public Producto findById(Integer id) {
		return ProductoRepository.findById(id).get();
	}

	@Override
	public void delete(Integer id) {
		ProductoRepository.deleteById(id);		
	}
}
