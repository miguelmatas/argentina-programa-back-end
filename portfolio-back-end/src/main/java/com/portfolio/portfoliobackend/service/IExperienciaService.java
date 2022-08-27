package com.portfolio.portfoliobackend.service;

import com.portfolio.portfoliobackend.model.Experiencia;
import java.util.List;

public interface IExperienciaService {

    public List<Experiencia> getAllExperiencia();

    public Experiencia getExperiencia(Long id);

    public void saveExperiencia(Experiencia experiencia);

    public void deleteExperiencia(Long id);

    public void updateExperiencia(Long id, Experiencia experiencia);

    public Experiencia findExperiencia(Long id);

}
