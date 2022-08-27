package com.portfolio.portfoliobackend.service;

import com.portfolio.portfoliobackend.model.Persona;
import com.portfolio.portfoliobackend.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class PersonaService implements IPersonaService {

    @Autowired
    private PersonaRepository persoRepository;

    @Override
    public List<Persona> getAllPersonas() {
        return persoRepository.findAll();
    }

    @Override
    public Persona getPersona(Long id) {
        return persoRepository.findById(id).orElse(null);
    }

    @Override
    public void savePersona(Persona perso) {
        persoRepository.save(perso);
    }

    @Override
    public void deletePersona(Long id) {
        persoRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona perso = persoRepository.findById(id).orElse(null);
        return perso;
    }

    @Override
    public void updatePersona(Long id, Persona perso) {
        persoRepository.findById(id).ifPresent(consumer -> perso.setId(consumer.getId()));
        persoRepository.save(perso);
    }

}
