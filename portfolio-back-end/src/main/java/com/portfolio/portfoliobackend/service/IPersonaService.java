package com.portfolio.portfoliobackend.service;

import com.portfolio.portfoliobackend.model.Persona;
import java.util.List;

public interface IPersonaService {

    public List<Persona> getAllPersonas();

    public Persona getPersona(Long id);

    public void savePersona(Persona perso);

    public void deletePersona(Long id);

    public void updatePersona(Long id, Persona perso);

    public Persona findPersona(Long id);


}
