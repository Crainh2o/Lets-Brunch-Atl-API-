package com.example.demo.service;

import com.example.demo.model.BrunchPlaces;
import com.example.demo.model.Menu;
import com.example.demo.repository.BrunchRepository;
import com.example.demo.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BrunchService {
    @Autowired
    BrunchRepository brunchRepository;

    @Autowired
    MenuRepository menuRepository;

    public List<BrunchPlaces> getBrunchPlaces() {
        return brunchRepository.findAll();
    }

    public Optional<BrunchPlaces> getBrunchPlace(Long brunchId) {
        return brunchRepository.findById(brunchId);
    }

    public Menu getBrunchMenu(Long brunchId) {
        return menuRepository.findByBrunchPlacesListId(brunchId);
    }

}



