package com.demo.controller;

import com.demo.model.Usuario;
import com.demo.service.IServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class RestApi {

    private final IServices services;

    @GetMapping("api/v1/{name}")
    public Usuario getUserByName(@PathVariable String name) {
        return services.getUser(name);
    }

    @GetMapping("api/v1")
    public List<Usuario> getAllUser() {
        return Collections.singletonList(new Usuario());
    }

    @PostMapping("api/v1/{name}")
    public Usuario addUser(@PathVariable String name,@RequestBody Usuario usuario) {
        return services.addUser(usuario);
    }

}
