package com.sjv.AdminTiendaComputadoras.repository;

import com.sjv.AdminTiendaComputadoras.model.Distrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistritoRepository extends JpaRepository<Distrito, Integer> {
}
