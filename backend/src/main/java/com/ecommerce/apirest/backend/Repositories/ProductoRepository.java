package com.ecommerce.apirest.backend.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.apirest.backend.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
     
}
