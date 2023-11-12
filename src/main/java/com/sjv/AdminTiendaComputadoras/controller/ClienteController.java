package com.sjv.AdminTiendaComputadoras.controller;

import com.sjv.AdminTiendaComputadoras.model.Categoria;
import com.sjv.AdminTiendaComputadoras.model.Cliente;
import com.sjv.AdminTiendaComputadoras.model.Distrito;
import com.sjv.AdminTiendaComputadoras.service.CategoriaService;
import com.sjv.AdminTiendaComputadoras.service.ClienteService;
import com.sjv.AdminTiendaComputadoras.service.DistritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ClienteController {
    @Autowired
    ClienteService service;

    @Autowired
    DistritoService serviceDist;

    @GetMapping("/clientes")
    public String clientes(Model model){
        model.addAttribute("titulo", "Clientes");
        model.addAttribute("listClientes", service.getAllClientes());
        model.addAttribute("breadcrumb", "Clientes");
        return "clientes";
    }

    @GetMapping("/nuevoCliente")
    public String nuevoCliente(Model model){
        model.addAttribute("titulo", "Clientes");
        Cliente cliente = new Cliente();
        List<Distrito> distritos = serviceDist.getAllDistritos();
        model.addAttribute("cliente", cliente);
        model.addAttribute("distritos", distritos);
        model.addAttribute("breadcrumb", "Clientes");
        return "clientes_crear";
    }

    @PostMapping("/guardarCliente")
    public String guardarCliente(@ModelAttribute("cliente") Cliente cliente){
        service.saveCliente(cliente);
        return "redirect:/clientes";
    }

    @GetMapping("/editarCliente/{id}")
    public String editarCliente(@PathVariable(value="id") int id, Model model){
        Cliente cliente = service.getClienteById(id);
        List<Distrito> distritos = serviceDist.getAllDistritos();
        model.addAttribute("cliente", cliente);
        model.addAttribute("titulo", "Clientes");
        model.addAttribute("distritos", distritos);
        model.addAttribute("breadcrumb", "Clientes");
        return "clientes_editar";
    }
}
