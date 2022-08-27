package com.portfolio.portfoliobackend.service;

import com.portfolio.portfoliobackend.model.About;
import com.portfolio.portfoliobackend.repository.AboutRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class AboutService implements IAboutService {

    @Autowired
    private AboutRepository aboutRepository;

    @Override
    public List<About> getAllAbout() {
        return aboutRepository.findAll();
    }

    @Override
    public About getAbout(Long id) {
        return aboutRepository.findById(id).orElse(null);
    }

    @Override
    public void saveAbout(About about) {
        aboutRepository.save(about);
    }

    @Override
    public void deleteAbout(Long id) {
        aboutRepository.deleteById(id);
    }

    @Override
    public About findAbout(Long id) {
        About about = aboutRepository.findById(id).orElse(null);
        return about;
    }

    @Override
    public void updateAbout(Long id, About about) {
        aboutRepository.findById(id).ifPresent(consumer -> about.setId(consumer.getId()));
        aboutRepository.save(about);
    }

}
