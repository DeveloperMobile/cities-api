package com.github.developermobile.citiesapi.state.controller;

import com.github.developermobile.citiesapi.state.entity.State;
import com.github.developermobile.citiesapi.state.repository.StateRepository;
import com.github.developermobile.citiesapi.state.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/states")
public class StateController {
    @Autowired
    public StateService service;

    @GetMapping
    public List<State> findAll() {
        return service.findAll();
    }
}
