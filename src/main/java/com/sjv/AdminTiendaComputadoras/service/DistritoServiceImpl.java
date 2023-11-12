package com.sjv.AdminTiendaComputadoras.service;

import com.sjv.AdminTiendaComputadoras.model.Distrito;
import com.sjv.AdminTiendaComputadoras.model.Producto;
import com.sjv.AdminTiendaComputadoras.repository.DistritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DistritoServiceImpl implements DistritoService {
    @Autowired
    DistritoRepository repository;

    @Override
    public List<Distrito> getAllDistritos() {
        return repository.findAll();
    }

    @Override
    public Distrito getDistritoById(int id) {
        Optional<Distrito> optional = repository.findById(id);
        Distrito distrito = null;
        if(optional.isPresent()){
            distrito = optional.get();
        }else {
            throw new RuntimeException("El distrito no se encuentra");
        }
        return distrito;
    }

    @Override
    public Distrito saveDistrito(Distrito distrito) {
        return repository.save(distrito);
    }
}
