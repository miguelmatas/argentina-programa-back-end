package com.portfolio.portfoliobackend.controller;

import com.portfolio.portfoliobackend.model.Skill;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.portfolio.portfoliobackend.service.ISkillService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class SkillController {

    @Autowired
    private ISkillService interSkill;

    @GetMapping("/skill")
    public List<Skill> getAllSkill() {
        return interSkill.getAllSkill();
    }

    //Get one skill
    @GetMapping("/skill/{id}")
    public Skill skill(@PathVariable Long id) {
        return interSkill.getSkill(id);
    }

    @PostMapping("/skill")
    public ResponseEntity<String> createSkill(@RequestBody Skill skill) {
        interSkill.saveSkill(skill);
        return new ResponseEntity<>("Se creó un nuevo skill", HttpStatus.CREATED);
    }

    @DeleteMapping("/skill/{id}")
    public String deleteSkill(@PathVariable Long id) {
        interSkill.deleteSkill(id);
        return "Skill fue eliminado correctamente";
    }

    @PutMapping("/skill/{id}")
    public String updateSkill(@PathVariable Long id, @RequestBody Skill skill) {
        interSkill.updateSkill(id, skill);
        return "Cambiaste los datos de skill";
    }


}
