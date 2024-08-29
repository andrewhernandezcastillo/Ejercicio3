package com.demo.service;

import com.demo.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class IServices implements Services{

    List<Usuario> users = new ArrayList<>();

    @Override
    public Usuario addUser(Usuario usuario) {
        this.users.add(usuario);
        return this.getUser(usuario.nombre());
    }

    @Override
    public Usuario getUser(String name) {
        return this.users.stream()
                .filter(item->item.nombre().equals(name))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Usuario> getUsers() {
        return this.users;
    }

    @Override
    public Usuario updateUser(Usuario usuario) {
        int index = IntStream.range(0, users.size())
                .filter(i -> usuario.nombre().equals(users.get(i).nombre()))
                .findFirst()
                .orElse(-1);

        if(index != -1) {
            users.set(index, usuario);
        }

        return getUser(usuario.nombre());
    }


}
