package com.github.developermobile.citiesapi.state.service;

import com.github.developermobile.citiesapi.state.entity.State;
import com.github.developermobile.citiesapi.state.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateService {
    @Autowired
    public StateRepository repository;

    public List<State> findAll() {
        return repository.findAll();
    }
}
