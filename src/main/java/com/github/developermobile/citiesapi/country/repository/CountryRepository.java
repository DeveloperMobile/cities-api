package com.github.developermobile.citiesapi.country.repository;

import com.github.developermobile.citiesapi.country.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
