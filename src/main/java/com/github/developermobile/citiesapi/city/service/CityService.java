package com.github.developermobile.citiesapi.city.service;

import com.github.developermobile.citiesapi.city.entity.City;
import com.github.developermobile.citiesapi.city.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    @Autowired
    public CityRepository repository;

    public List<City> findAll() {
        return repository.findAll();
    }

    public Page<City> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }
}
