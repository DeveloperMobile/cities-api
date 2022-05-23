package com.github.developermobile.citiesapi.country.controller;

import com.github.developermobile.citiesapi.country.entity.Country;
import com.github.developermobile.citiesapi.country.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryController {
    @Autowired
    public CountryService service;

    @GetMapping
    public Page<Country> countries(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Country> findById(@PathVariable  Long id) {
       return service.findById(id);
    }
}
