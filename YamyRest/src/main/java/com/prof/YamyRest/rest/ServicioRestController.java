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

import com.prof.YamyRest.model.Servicio;
import com.prof.YamyRest.repository.IServicioRepository;

@RestController
@RequestMapping("/servicio")
@CrossOrigin(origins = "*")
public class ServicioRestController {
	
	@Autowired
	public IServicioRepository repoServ;
	
	@GetMapping
	public List<Servicio> listarServ()
	{
		return repoServ.findAll();
	}
	
	@PostMapping
	public void agregarServ(Servicio serv)
	{
		repoServ.save(serv);
		
	}
	
	@DeleteMapping
	public void eliminarServ(int idServicio) {
		
		repoServ.deleteById(idServicio);
	}
	
	@PutMapping
	public void modificarServ(Servicio serv) 
	{
		repoServ.save(serv);
	}
}



