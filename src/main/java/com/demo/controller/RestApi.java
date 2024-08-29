package com.demo.controller;

import com.demo.model.Usuario;
import com.demo.service.IServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.Collections;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class RestApi {
//Agregar Update como adicional
    private final IServices services;

    @GetMapping("api/v1/{name}")
    public Usuario getUserByName(@PathVariable String name) {
        return services.getUser(name);
    }

    @GetMapping("api/v1")
    public List<Usuario> getAllUser() {
        return services.getUsers();
    }

    @PostMapping("api/v1")
    public Usuario addUser(@RequestBody Usuario usuario) {
        return services.addUser(usuario);
    }

    @PutMapping("api/v1")
    public Usuario putUser(@RequestBody Usuario usuario){
        return services.putUser(usuario);
    }

}
