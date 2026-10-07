package com.example.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Inscripcion;
import com.example.demo.repositories.InscripcionRepository;

@RestController
@RequestMapping("/api/v1/inscripcion")
public class InscripcionController {

    @Autowired
    private InscripcionRepository repo;

    @GetMapping
    public List<Inscripcion> getInscripciones() {
        return repo.findAll();
    }

    @PostMapping
    public Inscripcion guardarInscripcion(@RequestBody Inscripcion i) {
        return repo.save(i);
    }
}