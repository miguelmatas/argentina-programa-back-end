package com.portfolio.portfoliobackend.controller;

import com.portfolio.portfoliobackend.model.Experiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.portfolio.portfoliobackend.service.IExperienciaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class ExperienciaController {
    

    @Autowired
    private IExperienciaService interExperiencia;

    @GetMapping("/experiencia")
    public List<Experiencia> getAllExperiencias() {
        return interExperiencia.getAllExperiencia();
    }

    //Get one experiencia
    @GetMapping("/experiencia/{id}")
    public Experiencia experiencia(@PathVariable Long id) {
        return interExperiencia.getExperiencia(id);
    }

    @PostMapping("/experiencia")
    public ResponseEntity<String> createExperiencia(@RequestBody Experiencia experiencia) {
        interExperiencia.saveExperiencia(experiencia);
        return new ResponseEntity<>("Se creó una nueva experiencia", HttpStatus.CREATED);
    }

    @DeleteMapping("/experiencia/{id}")
    public String deleteExperiencia(@PathVariable Long id) {
        interExperiencia.deleteExperiencia(id);
        return "La experiencia fue eliminada correctamente";
    }

    @PutMapping("/experiencia/{id}")
    public String updateExperiencia(@PathVariable Long id, @RequestBody Experiencia experiencia) {
        interExperiencia.updateExperiencia(id, experiencia);
        return "Cambiaste los datos de experiencia";
    }


}
