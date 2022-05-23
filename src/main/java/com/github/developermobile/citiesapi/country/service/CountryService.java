package com.github.developermobile.citiesapi.country.service;

import com.github.developermobile.citiesapi.country.entity.Country;
import com.github.developermobile.citiesapi.country.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Service
public class CountryService {
    @Autowired
    public CountryRepository repository;

    public Page<Country> findAll(Pageable page) {
        return repository.findAll(page);
    }

    public ResponseEntity<Country> findById(Long id) {
        Optional<Country> optional = repository.findById(id);
        if (optional.isPresent()) {
            return ResponseEntity.ok(optional.get());
        }
        return ResponseEntity.notFound().build();
    }
}
