package com.sjv.AdminTiendaComputadoras.service;

import com.sjv.AdminTiendaComputadoras.model.Categoria;
import com.sjv.AdminTiendaComputadoras.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        Optional<Categoria> optional = repository.findById(id);
        Categoria categoria = null;
        if(optional.isPresent()){
            categoria = optional.get();
        }else {
            throw new RuntimeException("La categoría no se encuentra");
        }
        return categoria;
    }

    @Override
    public Categoria saveCategoria(Categoria categoria) {
        return repository.save(categoria);
    }

}
