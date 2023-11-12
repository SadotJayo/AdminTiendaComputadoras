package com.sjv.AdminTiendaComputadoras.service;

import com.sjv.AdminTiendaComputadoras.model.Cliente;
import com.sjv.AdminTiendaComputadoras.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    ClienteRepository repository;

    @Override
    public List<Cliente> getAllClientes() {
        return repository.findAll();
    }

    @Override
    public Cliente getClienteById(int id) {
        Optional<Cliente> optional = repository.findById(id);
        Cliente cliente = null;
        if(optional.isPresent()){
            cliente = optional.get();
        }else {
            throw new RuntimeException("El cliente no se encuentra");
        }
        return cliente;
    }

    @Override
    public Cliente saveCliente(Cliente cliente) {
        return repository.save(cliente);
    }
}
