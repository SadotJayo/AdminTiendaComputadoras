package com.sjv.AdminTiendaComputadoras.service;

import com.sjv.AdminTiendaComputadoras.model.Categoria;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoriaService {
    List<Categoria> getAllCategorias();
    Categoria getCategoriaById(int id);
    Categoria saveCategoria(Categoria categoria);
}
