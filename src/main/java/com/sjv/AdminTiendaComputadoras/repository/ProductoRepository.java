package com.sjv.AdminTiendaComputadoras.repository;

import com.sjv.AdminTiendaComputadoras.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
