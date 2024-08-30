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

    @Override
    public List<Usuario> putUser(String name, Usuario usuario) {

        this.users = this.users.stream().map(item->{
            if(item.getNombre().equals(name)){
                item.setEdad(usuario.getEdad());
                item.setApellido(usuario.getApellido());
                item.setNombre(usuario.getNombre());
                item.setCorreo(usuario.getCorreo());
            }
            return item;
        }).toList();

        return this.users;
    }


}
