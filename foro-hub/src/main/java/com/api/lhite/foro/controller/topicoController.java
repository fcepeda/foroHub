package com.api.lhite.foro.controller;

import com.api.lhite.foro.domain.topico.DatosActualizarTopico;
import com.api.lhite.foro.domain.topico.DatosRegistroTopico;
import com.api.lhite.foro.domain.topico.Topico;
import com.api.lhite.foro.domain.topico.TopicoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/topicos")
public class topicoController {

    @Autowired
    private TopicoRepository topicoRepository;

    @PostMapping
    public void registrarTopico(@RequestBody DatosRegistroTopico datosRegistroTopico)
    {
        topicoRepository.save(new Topico(datosRegistroTopico));
    }
    @GetMapping
    public List<Topico> listadoTopicos()
    {
        return topicoRepository.findAll();
    }
    @GetMapping("/{id}")
    public Topico verTopicoPorId(@Valid @PathVariable Long id)
    {
        Optional<Topico> topicoOPT = topicoRepository.findById(id);

        return topicoOPT.orElse(null);

    }
    @PutMapping("/{id}")
    @Transactional
    public void actualizarTopico(@PathVariable Long id,@RequestBody @Valid DatosActualizarTopico datosActualizarTopico)
    {
        Topico topico = topicoRepository.findById(id).orElse(null);

        if(topico!=null)
        {
            topico.actualizarDatos(datosActualizarTopico);
        }
    }
    @DeleteMapping("/{id}")
    @Transactional
    public void eliminarTopico(@PathVariable Long id)
    {
        Topico topico = topicoRepository.findById(id).orElse(null);

        if(topico!=null)
        {
            topicoRepository.deleteById(id);
        }
    }
}
