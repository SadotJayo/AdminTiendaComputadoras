package com.sjv.AdminTiendaComputadoras.controller;

import com.sjv.AdminTiendaComputadoras.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoriaController {

    @Autowired
    CategoriaService service;

    @GetMapping("/categorias")
    public String viewHome(Model model){
        model.addAttribute("listCategorias", service.getAllCategorias());
        return "index1";
    }

}
