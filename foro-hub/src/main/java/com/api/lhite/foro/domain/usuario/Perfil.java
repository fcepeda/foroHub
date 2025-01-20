package com.api.lhite.foro.domain.usuario;

import jakarta.persistence.Embeddable;

@Embeddable
public class Perfil {
    //private Long id;
    private String nombre;

    public Perfil() {
    }

    public Perfil(DatosPerfil autor) {
        this.nombre = autor.nombre();
    }

    public String getNombre() {
        return nombre;
    }
}
