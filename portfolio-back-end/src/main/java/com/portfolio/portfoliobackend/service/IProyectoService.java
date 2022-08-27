package com.portfolio.portfoliobackend.service;

import com.portfolio.portfoliobackend.model.Proyecto;
import java.util.List;

public interface IProyectoService {

    public List<Proyecto> getAllProyectos();

    public Proyecto getProyecto(Long id);

    public void saveProyecto(Proyecto proyecto);

    public void deleteProyecto(Long id);

    public void updateProyecto(Long id, Proyecto proyecto);

    public Proyecto findProyecto(Long id);


}
