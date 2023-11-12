package com.sjv.AdminTiendaComputadoras.controller;

import com.sjv.AdminTiendaComputadoras.model.Categoria;
import com.sjv.AdminTiendaComputadoras.model.Producto;
import com.sjv.AdminTiendaComputadoras.service.CategoriaService;
import com.sjv.AdminTiendaComputadoras.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProductoController {
    @Autowired
    ProductoService service;

    @Autowired
    CategoriaService serviceCat;

    @GetMapping("/productos")
    public String productos(Model model){
        model.addAttribute("titulo", "Productos");
        model.addAttribute("listProductos", service.getAllProductos());
        model.addAttribute("breadcrumb", "Productos");
        return "productos";
    }

    @GetMapping("/nuevoProducto")
    public String nuevoProducto(Model model){
        model.addAttribute("titulo", "Productos");
        Producto producto = new Producto();
        List<Categoria> categorias = serviceCat.getAllCategorias();
        model.addAttribute("producto", producto);
        model.addAttribute("categorias", categorias);
        model.addAttribute("breadcrumb", "Productos");
        return "productos_crear";
    }

    @PostMapping("/guardarProducto")
    public String guardarProducto(@ModelAttribute("producto") Producto producto){
        service.saveProducto(producto);
        return "redirect:/productos";
    }

    @GetMapping("/editarProducto/{id}")
    public String editarProducto(@PathVariable(value="id") int id, Model model){
        Producto producto = service.getProductoById(id);
        List<Categoria> categorias = serviceCat.getAllCategorias();
        model.addAttribute("titulo", "Productoss");
        model.addAttribute("categorias", categorias);
        model.addAttribute("producto", producto);
        model.addAttribute("breadcrumb", "Productos");
        return "productos_editar";
    }
}
