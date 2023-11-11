package com.sjv.AdminTiendaComputadoras.repository;

import com.sjv.AdminTiendaComputadoras.model.PedidoDetalle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoDetalleRepository extends JpaRepository<PedidoDetalle, Integer> {
}
