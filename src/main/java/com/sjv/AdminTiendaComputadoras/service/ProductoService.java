package com.sjv.AdminTiendaComputadoras.service;

import com.sjv.AdminTiendaComputadoras.model.Producto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductoService {
    List<Producto> getAllProductos();
    Producto getProductoById(int id);
    Producto saveProducto(Producto producto);
}
