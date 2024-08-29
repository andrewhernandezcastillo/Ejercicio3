package com.demo.model;

import lombok.Setter;
import lombok.Getter;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    private String nombre;
    private String apellido;
    private String correo;
    private Long edad;

}
