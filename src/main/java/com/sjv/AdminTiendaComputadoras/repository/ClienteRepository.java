package com.sjv.AdminTiendaComputadoras.repository;

import com.sjv.AdminTiendaComputadoras.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
