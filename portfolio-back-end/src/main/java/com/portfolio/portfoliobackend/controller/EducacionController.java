package com.portfolio.portfoliobackend.controller;

import com.portfolio.portfoliobackend.model.Educacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.portfolio.portfoliobackend.service.IEducacionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class EducacionController {

    @Autowired
    private IEducacionService interEducacion;

    @GetMapping("/educacion")
    public List<Educacion> getAllEducacions() {
        return interEducacion.getAllEducacion();
    }

    //Get one educacion
    @GetMapping("/educacion/{id}")
    public Educacion educacion(@PathVariable Long id) {
        return interEducacion.getEducacion(id);
    }

    @PostMapping("/educacion")
    public ResponseEntity<String> createEducacion(@RequestBody Educacion educacion) {
        interEducacion.saveEducacion(educacion);
        return new ResponseEntity<>("Se creó una nueva educacion", HttpStatus.CREATED);
    }

    @DeleteMapping("/educacion/{id}")
    public String deleteEducacion(@PathVariable Long id) {
        interEducacion.deleteEducacion(id);
        return "La educacion fue eliminada correctamente";
    }

    @PutMapping("/educacion/{id}")
    public String updateEducacion(@PathVariable Long id, @RequestBody Educacion educacion) {
        interEducacion.updateEducacion(id, educacion);
        return "Cambiaste los datos de educacion";
    }


}
