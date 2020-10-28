package com.prof.YamyRest.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prof.YamyRest.model.Producto;
import com.prof.YamyRest.repository.IProductoRepository;

@RestController

@RequestMapping("/producto")
@CrossOrigin(origins = "*")
public class ProductoRestController {

	@Autowired
	public IProductoRepository repo;
	
	@GetMapping
	public List<Producto> listar()
	{
		return repo.findAll();
	}
	
	@PostMapping
	public void agregar(Producto pro)
	{
		repo.save(pro);
		
	}
	
	@DeleteMapping
	public void eliminar(int id) {
		
		repo.deleteById(id);
	}
	
	@PutMapping
	public void modificar(Producto pro) 
	{
		repo.save(pro);
	}
}

	