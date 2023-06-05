package com.example.demo.service;

import com.example.demo.model.BrunchPlaces;
import com.example.demo.model.Menu;
import com.example.demo.repository.BrunchRepository;
import com.example.demo.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

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
        return menuRepository.findByBrunchPlaces(getBrunchPlace(brunchId).get());
    }

}



