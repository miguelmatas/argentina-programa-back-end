package com.portfolio.portfoliobackend.service;

import com.portfolio.portfoliobackend.model.About;
import java.util.List;

public interface IAboutService {

    public List<About> getAllAbout();

    public About getAbout(Long id);

    public void saveAbout(About about);

    public void deleteAbout(Long id);

    public void updateAbout(Long id, About about);

    public About findAbout(Long id);

}
