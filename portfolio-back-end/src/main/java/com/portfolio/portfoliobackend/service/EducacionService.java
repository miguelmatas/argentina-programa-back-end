package com.portfolio.portfoliobackend.service;

import com.portfolio.portfoliobackend.model.Educacion;
import com.portfolio.portfoliobackend.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class EducacionService implements IEducacionService {

    @Autowired
    private EducacionRepository educacionRepository;

    @Override
    public List<Educacion> getAllEducacion() {
        return educacionRepository.findAll();
    }

    @Override
    public Educacion getEducacion(Long id) {
        return educacionRepository.findById(id).orElse(null);
    }

    @Override
    public void saveEducacion(Educacion educacion) {
        educacionRepository.save(educacion);
    }

    @Override
    public void deleteEducacion(Long id) {
        educacionRepository.deleteById(id);
    }

    @Override
    public Educacion findEducacion(Long id) {
        Educacion educacion = educacionRepository.findById(id).orElse(null);
        return educacion;
    }

    @Override
    public void updateEducacion(Long id, Educacion educacion) {
        educacionRepository.findById(id).ifPresent(consumer -> educacion.setId(consumer.getId()));
        educacionRepository.save(educacion);
    }

}
