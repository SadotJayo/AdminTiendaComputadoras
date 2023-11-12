package com.sjv.AdminTiendaComputadoras.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String viewHome(Model model){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String user = authentication.getName();
        model.addAttribute("username", user);
        model.addAttribute("breadcrumb", "Principal");
        return "index";
    }
}
