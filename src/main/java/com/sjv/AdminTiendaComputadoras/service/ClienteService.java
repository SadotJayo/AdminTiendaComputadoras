package com.sjv.AdminTiendaComputadoras.service;

import com.sjv.AdminTiendaComputadoras.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClienteService {
    List<Cliente> getAllClientes();
    Cliente getClienteById(int id);
    Cliente saveCliente(Cliente cliente);
}
