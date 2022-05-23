package com.github.developermobile.citiesapi.state.repository;

import com.github.developermobile.citiesapi.state.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
