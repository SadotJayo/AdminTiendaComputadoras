package com.sjv.AdminTiendaComputadoras.service;

import com.sjv.AdminTiendaComputadoras.model.Producto;
import com.sjv.AdminTiendaComputadoras.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {
    @Autowired
    ProductoRepository repository;

    @Override
    public List<Producto> getAllProductos() {
        return repository.findAll();
    }

    @Override
    public Producto getProductoById(int id) {
        Optional<Producto> optional = repository.findById(id);
        Producto producto = null;
        if(optional.isPresent()){
            producto = optional.get();
        }else {
            throw new RuntimeException("El producto no se encuentra");
        }
        return producto;
    }

    @Override
    public Producto saveProducto(Producto producto) {
        return repository.save(producto);
    }
}
