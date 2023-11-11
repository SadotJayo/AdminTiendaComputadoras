package com.sjv.AdminTiendaComputadoras.service;

import com.sjv.AdminTiendaComputadoras.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsuarioService {
    List<Usuario> getAllUsuarios();
    Usuario getUsuarioById(int id);
    Usuario saveUsuario(Usuario usuario);
    Usuario updateUsuario(Usuario usuario, int id);
}
