package com.api.lhite.foro.domain.topico;
import com.api.lhite.foro.domain.usuario.DatosPerfil;
import com.api.lhite.foro.domain.usuario.Perfil;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public record DatosRegistroTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotNull
        @Valid
        DatosPerfil autor,

        @NotNull
        @Valid
        DatosCurso curso
) {
}
