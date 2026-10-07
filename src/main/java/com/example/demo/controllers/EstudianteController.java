package com.example.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Estudiante;
import com.example.demo.repositories.EstudianteRepository;

@RestController
@RequestMapping("/api/v1/estudiante")
public class EstudianteController {

    @Autowired
    private EstudianteRepository repo;

    @GetMapping
    public List<Estudiante> getEstudiantes() {
        return repo.findAll();
    }

    @PostMapping
    public Estudiante crearEstudiante(@RequestBody Estudiante e) {
        return repo.save(e);
    }
}