package com.github.developermobile.citiesapi.city.controller;

import com.github.developermobile.citiesapi.city.entity.City;
import com.github.developermobile.citiesapi.city.service.CityService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities")
public class CityController {
    @Autowired
    public CityService service;

    @GetMapping
    public Page<City> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }
}
