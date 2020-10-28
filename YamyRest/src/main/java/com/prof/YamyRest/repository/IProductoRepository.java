package com.prof.YamyRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prof.YamyRest.model.Producto;

public interface IProductoRepository extends JpaRepository<Producto, Integer>{
	

}
