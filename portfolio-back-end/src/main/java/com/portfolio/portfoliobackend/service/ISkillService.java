package com.portfolio.portfoliobackend.service;

import com.portfolio.portfoliobackend.model.Skill;
import java.util.List;

public interface ISkillService {

    public List<Skill> getAllSkill();

    public Skill getSkill(Long id);

    public void saveSkill(Skill skill);

    public void deleteSkill(Long id);

    public void updateSkill(Long id, Skill skill);

    public Skill findSkill(Long id);


}
