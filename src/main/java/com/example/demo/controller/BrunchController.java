package com.example.demo.controller;

import com.example.demo.model.BrunchPlaces;
import com.example.demo.model.Menu;
import com.example.demo.repository.BrunchRepository;
import com.example.demo.service.BrunchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class BrunchController {

    @Autowired
    BrunchService brunchService;

   @GetMapping(path = "/brunchPlaces/")
    public List<BrunchPlaces> getBrunchPlaces() {
       return brunchService.getBrunchPlaces();
   }

   @GetMapping(path = "/brunchPlaces/{brunchId}")
    public Optional<BrunchPlaces> getBrunchPlace(@PathVariable Long brunchId) {
       return brunchService.getBrunchPlace(brunchId);
   }

   @GetMapping(path = "/brunchPlaces/{brunchId}/menu")
    public Menu getBrunchMenu(@PathVariable Long brunchId) {
       return brunchService.getBrunchMenu(brunchId);
   }

}

