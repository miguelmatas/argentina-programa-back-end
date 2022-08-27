package com.portfolio.portfoliobackend.service;

import com.portfolio.portfoliobackend.model.Proyecto;
import com.portfolio.portfoliobackend.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ProyectoService implements IProyectoService {

    @Autowired
    private ProyectoRepository proyectoRepository;

    @Override
    public List<Proyecto> getAllProyectos() {
        return proyectoRepository.findAll();
    }

    @Override
    public Proyecto getProyecto(Long id) {
        return proyectoRepository.findById(id).orElse(null);
    }

    @Override
    public void saveProyecto(Proyecto proyecto) {
        proyectoRepository.save(proyecto);
    }

    @Override
    public void deleteProyecto(Long id) {
        proyectoRepository.deleteById(id);
    }

    @Override
    public Proyecto findProyecto(Long id) {
        Proyecto proyecto = proyectoRepository.findById(id).orElse(null);
        return proyecto;
    }

    @Override
    public void updateProyecto(Long id, Proyecto proyecto) {
        proyectoRepository.findById(id).ifPresent(consumer -> proyecto.setId(consumer.getId()));
        proyectoRepository.save(proyecto);
    }

}
