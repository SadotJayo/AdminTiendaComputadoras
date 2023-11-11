package com.sjv.AdminTiendaComputadoras.service;

import com.sjv.AdminTiendaComputadoras.model.Usuario;
import com.sjv.AdminTiendaComputadoras.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService, UserDetailsService {
    @Autowired
    UsuarioRepository repository;
    @Override
    public List<Usuario> getAllUsuarios() {
        return null;
    }

    @Override
    public Usuario getUsuarioById(int id) {
        return null;
    }

    @Override
    public Usuario saveUsuario(Usuario usuario) {
        return null;
    }

    @Override
    public Usuario updateUsuario(Usuario usuario, int id) {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = repository.getUsuarioByUsuario(username).orElseThrow(()->new UsernameNotFoundException("Usuario no encontrado"));
        return new User(usuario.getUsuario(), usuario.getContrasenia(), new ArrayList<>());
    }
}
