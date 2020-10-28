package com.prof.YamyRest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.prof.YamyRest.model.Producto;
import com.prof.YamyRest.model.Servicio;
import com.prof.YamyRest.repository.IProductoRepository;
import com.prof.YamyRest.repository.IServicioRepository;

@SpringBootTest
class YamyRestApplicationTests {

	@Autowired
	public IProductoRepository repo;
	
	@Autowired
	public IServicioRepository repoServ;
	
	@Test
	void contextLoads() {
		
		Servicio s1 = new Servicio();
		s1.setNombreServicio("Limpieza");
		s1.setPrecioServicio("20000");
		
		Servicio s2 = new Servicio();
		s2.setNombreServicio("Pintura");
		s2.setPrecioServicio("15000");
				
		repoServ.save(s1);
		repoServ.save(s2);
		
		
//		Producto p1 = new Producto();
//		p1.setNombre("Lapiz");
//		p1.setPrecio("900");
//		p1.setTipo("Escritura");
//		
//		Producto p2 = new Producto();
//		p2.setNombre("500 Hojas");
//		p2.setPrecio("4000");
//		p2.setTipo("Papeleria");
//		
//		repo.save(p1);
//		repo.save(p2);
	}

}
