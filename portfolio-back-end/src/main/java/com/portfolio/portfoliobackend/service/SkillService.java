package com.portfolio.portfoliobackend.service;

import com.portfolio.portfoliobackend.model.Skill;
import com.portfolio.portfoliobackend.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class SkillService implements ISkillService {

    @Autowired
    private SkillRepository skillRepository;

    @Override
    public List<Skill> getAllSkill() {
        return skillRepository.findAll();
    }

    @Override
    public Skill getSkill(Long id) {
        return skillRepository.findById(id).orElse(null);
    }

    @Override
    public void saveSkill(Skill skill) {
        skillRepository.save(skill);
    }

    @Override
    public void deleteSkill(Long id) {
        skillRepository.deleteById(id);
    }

    @Override
    public Skill findSkill(Long id) {
        Skill skill = skillRepository.findById(id).orElse(null);
        return skill;
    }

    @Override
    public void updateSkill(Long id, Skill skill) {
        skillRepository.findById(id).ifPresent(consumer -> skill.setId(consumer.getId()));
        skillRepository.save(skill);
    }

}
