package com.portfolio.portfoliobackend.service;

import com.portfolio.portfoliobackend.model.Experiencia;
import com.portfolio.portfoliobackend.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ExperienciaService implements IExperienciaService {

    @Autowired
    private ExperienciaRepository experienciaRepository;

    @Override
    public List<Experiencia> getAllExperiencia() {
        return experienciaRepository.findAll();
    }

    @Override
    public Experiencia getExperiencia(Long id) {
        return experienciaRepository.findById(id).orElse(null);
    }

    @Override
    public void saveExperiencia(Experiencia experiencia) {
        experienciaRepository.save(experiencia);
    }

    @Override
    public void deleteExperiencia(Long id) {
        experienciaRepository.deleteById(id);
    }

    @Override
    public Experiencia findExperiencia(Long id) {
        Experiencia experiencia = experienciaRepository.findById(id).orElse(null);
        return experiencia;
    }

    @Override
    public void updateExperiencia(Long id, Experiencia experiencia) {
        experienciaRepository.findById(id).ifPresent(consumer -> experiencia.setId(consumer.getId()));
        experienciaRepository.save(experiencia);
    }

}
