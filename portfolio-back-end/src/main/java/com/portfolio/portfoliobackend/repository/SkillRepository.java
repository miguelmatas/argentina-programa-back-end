package com.portfolio.portfoliobackend.repository;

import com.portfolio.portfoliobackend.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SkillRepository extends JpaRepository <Skill, Long> {

}