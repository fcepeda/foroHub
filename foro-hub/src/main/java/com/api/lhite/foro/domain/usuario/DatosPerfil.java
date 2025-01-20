package com.api.lhite.foro.domain.usuario;

import jakarta.validation.constraints.NotBlank;

public record DatosPerfil(
        @NotBlank
        String nombre) {
}
