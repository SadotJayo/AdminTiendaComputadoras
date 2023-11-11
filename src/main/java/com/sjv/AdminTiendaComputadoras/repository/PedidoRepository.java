package com.sjv.AdminTiendaComputadoras.repository;

import com.sjv.AdminTiendaComputadoras.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
