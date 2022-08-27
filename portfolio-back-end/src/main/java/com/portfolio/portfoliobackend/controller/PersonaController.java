package com.portfolio.portfoliobackend.controller;

import com.portfolio.portfoliobackend.model.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.portfolio.portfoliobackend.service.IPersonaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class PersonaController {

    @Autowired
    private IPersonaService interPersona;

    @GetMapping("/persona")
    public List<Persona> getAllPersonas() {
        return interPersona.getAllPersonas();
    }

    //Get one persona
    @GetMapping("/persona/{id}")
    public Persona perso(@PathVariable Long id) {
        return interPersona.getPersona(id);
    }

    @PostMapping("/persona")
    public ResponseEntity<String> createPersona(@RequestBody Persona perso) {
        interPersona.savePersona(perso);
        return new ResponseEntity<>("Se creó una nueva persona", HttpStatus.CREATED);
    }

    @DeleteMapping("/persona/{id}")
    public String deletePersona(@PathVariable Long id) {
        interPersona.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }

    @PutMapping("/persona/{id}")
    public String updatePersona(@PathVariable Long id, @RequestBody Persona perso) {
        interPersona.updatePersona(id, perso);
        return "Cambiaste los datos de Persona";
    }

}
