package com.portfolio.portfoliobackend.repository;

import com.portfolio.portfoliobackend.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ExperienciaRepository extends JpaRepository <Experiencia, Long> {

}