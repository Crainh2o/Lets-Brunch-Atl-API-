package com.example.demo.controller;

import com.example.demo.model.BrunchPlaces;
import com.example.demo.repository.BrunchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class BrunchController {

    private BrunchRepository brunchRepository;

   @Autowired
    public void setBrunchRepository(BrunchRepository brunchRepository) {
        this.brunchRepository = brunchRepository;
   }

   @GetMapping(path = "/brunchPlaces/")
    public List<BrunchPlaces> getBrunchPlaces() {
       return brunchRepository.findAll();
   }

   @GetMapping(path = "/brunchPlaces/{brunchId}")
    public Optional<BrunchPlaces> getBrunchPlace(@PathVariable Long brunchId) {
       return brunchRepository.findById(brunchId);
   }

   @GetMapping(path = "/brunchPlaces/{brunchName}/{menuId}")
    public BrunchPlaces getBrunchMenu(@PathVariable String brunchName, @PathVariable Long menuId) {
       return brunchRepository.findByMenuIdAndName(menuId, brunchName);
   }

}

