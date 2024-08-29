package com.demo.service;

import com.demo.model.Usuario;

import java.util.List;

public interface Services {

    Usuario addUser(Usuario usuario);
    Usuario getUser(String name);
    List<Usuario> getUsers();
    Usuario updateUser(String name,Usuario usuario);
}
