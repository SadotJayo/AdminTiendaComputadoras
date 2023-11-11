package com.sjv.AdminTiendaComputadoras.service;

import com.sjv.AdminTiendaComputadoras.model.Categoria;
import com.sjv.AdminTiendaComputadoras.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    @Autowired
    CategoriaRepository repository;
    @Override
    public List<Categoria> getAllCategorias() {
        return repository.findAll();
    }

    @Override
    public Categoria getCategoriaById(int id) {
        return null;
    }

    @Override
    public Categoria saveCategoria(Categoria categoria) {
        return null;
    }

    @Override
    public Categoria updateCategoria(Categoria categoria, int id) {
        return null;
    }
}
