package com.portfolio.portfoliobackend.controller;

import com.portfolio.portfoliobackend.model.Proyecto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.portfolio.portfoliobackend.service.IProyectoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class ProyectoController {

    @Autowired
    private IProyectoService interProyecto;

    @GetMapping("/proyecto")
    public List<Proyecto> getAllProyectos() {
        return interProyecto.getAllProyectos();
    }

    //Get one proyecto
    @GetMapping("/proyecto/{id}")
    public Proyecto proyecto(@PathVariable Long id) {
        return interProyecto.getProyecto(id);
    }

    @PostMapping("/proyecto")
    public ResponseEntity<String> createProyecto(@RequestBody Proyecto proyecto) {
        interProyecto.saveProyecto(proyecto);
        return new ResponseEntity<>("Se creó una nueva proyecto", HttpStatus.CREATED);
    }

    @DeleteMapping("/proyecto/{id}")
    public String deleteProyecto(@PathVariable Long id) {
        interProyecto.deleteProyecto(id);
        return "La proyecto fue eliminada correctamente";
    }

    @PutMapping("/proyecto/{id}")
    public String updateProyecto(@PathVariable Long id, @RequestBody Proyecto proyecto) {
        interProyecto.updateProyecto(id, proyecto);
        return "Cambiaste los datos de Proyecto";
    }

}
