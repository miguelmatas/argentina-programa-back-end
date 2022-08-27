package com.portfolio.portfoliobackend.controller;

import com.portfolio.portfoliobackend.model.About;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.portfolio.portfoliobackend.service.IAboutService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class AboutController {

    @Autowired
    private IAboutService interAbout;

    @GetMapping("/about")
    public List<About> getAllAbouts() {
        return interAbout.getAllAbout();
    }

    //Get one about
    @GetMapping("/about/{id}")
    public About about(@PathVariable Long id) {
        return interAbout.getAbout(id);
    }

    @PostMapping("/about")
    public ResponseEntity<String> createAbout(@RequestBody About about) {
        interAbout.saveAbout(about);
        return new ResponseEntity<>("Se creó un nuevo about", HttpStatus.CREATED);
    }

    @DeleteMapping("/about/{id}")
    public String deleteAbout(@PathVariable Long id) {
        interAbout.deleteAbout(id);
        return "About fue eliminado correctamente";
    }

    @PutMapping("/about/{id}")
    public String updateAbout(@PathVariable Long id, @RequestBody About about) {
        interAbout.updateAbout(id, about);
        return "Cambiaste los datos de about";
    }


}
