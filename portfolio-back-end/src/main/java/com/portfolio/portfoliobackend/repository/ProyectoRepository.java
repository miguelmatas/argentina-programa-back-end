package com.portfolio.portfoliobackend.repository;

import com.portfolio.portfoliobackend.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProyectoRepository extends JpaRepository <Proyecto, Long> {

}