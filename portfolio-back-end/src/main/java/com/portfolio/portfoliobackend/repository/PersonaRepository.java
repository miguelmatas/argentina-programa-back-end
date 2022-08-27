package com.portfolio.portfoliobackend.repository;

import com.portfolio.portfoliobackend.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long> {

}