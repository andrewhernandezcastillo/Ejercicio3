package com.demo.service;

import com.demo.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IServices implements Services{

    List<Usuario> users = new ArrayList<>();

    @Override
    public Usuario addUser(Usuario usuario) {
        this.users.add(usuario);
        return this.getUser(usuario.getNombre());
    }

    @Override
    public Usuario getUser(String name) {
        return this.users.stream()
                .filter(item->item.getNombre().equals(name))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Usuario> getUsers() {
        return this.users;
    }


}
