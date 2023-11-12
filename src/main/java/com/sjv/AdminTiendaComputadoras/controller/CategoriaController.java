package com.sjv.AdminTiendaComputadoras.controller;

import com.sjv.AdminTiendaComputadoras.model.Categoria;
import com.sjv.AdminTiendaComputadoras.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CategoriaController {

    @Autowired
    CategoriaService service;

    @GetMapping("/categorias")
    public String categorias(Model model){
        model.addAttribute("titulo", "Categorías");
        model.addAttribute("listCategorias", service.getAllCategorias());
        model.addAttribute("breadcrumb", "Categorías");
        return "categorias";
    }

    @GetMapping("/nuevaCategoria")
    public String nuevaCategoria(Model model){
        model.addAttribute("titulo", "Categorías");
        Categoria categoria = new Categoria();
        model.addAttribute("categoria", categoria);
        model.addAttribute("breadcrumb", "Categorías");
        return "categorias_crear";
    }

    @PostMapping("/guardarCategoria")
    public String guardarCategoria(@ModelAttribute("categoria") Categoria categoria){
        service.saveCategoria(categoria);
        return "redirect:/categorias";
    }

    @GetMapping("/editarCategoria/{id}")
    public String editarCategoria(@PathVariable(value="id") int id, Model model){
        Categoria categoria = service.getCategoriaById(id);
        model.addAttribute("titulo", "Categorías");
        model.addAttribute("categoria", categoria);
        model.addAttribute("breadcrumb", "Categorías");
        return "categorias_editar";
    }

}
