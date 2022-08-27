package com.portfolio.portfoliobackend.service;

import com.portfolio.portfoliobackend.model.Educacion;
import java.util.List;

public interface IEducacionService {

    public List<Educacion> getAllEducacion();

    public Educacion getEducacion(Long id);

    public void saveEducacion(Educacion educacion);

    public void deleteEducacion(Long id);

    public void updateEducacion(Long id, Educacion educacion);

    public Educacion findEducacion(Long id);

}
