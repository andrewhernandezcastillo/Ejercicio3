package com.demo.controller;

import com.demo.model.Usuario;
import com.demo.service.IServices;
import com.demo.service.Services;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class RestApi {

    private final Services services;

    @GetMapping("api/v1/{name}")
    public Usuario getUserByName(@PathVariable String name) {
        return services.getUser(name);
    }

    @GetMapping("api/v1")
    public List<Usuario> getAllUser() {
        return services.getUsers();
    }

    @PostMapping("api/v1/add")
    public Usuario addUser(@RequestBody Usuario usuario) {
        return services.addUser(usuario);
    }

    @PutMapping("api/v1/put")
    public Usuario updateUser(@RequestBody Usuario usuario) {
        return services.updateUser(usuario);
    }

}
