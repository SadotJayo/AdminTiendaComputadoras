package com.sjv.AdminTiendaComputadoras.service;

import com.sjv.AdminTiendaComputadoras.model.Distrito;
import com.sjv.AdminTiendaComputadoras.model.Producto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DistritoService {
    List<Distrito> getAllDistritos();
    Distrito getDistritoById(int id);
    Distrito saveDistrito(Distrito distrito);
}
