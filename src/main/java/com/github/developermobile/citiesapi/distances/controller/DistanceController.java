package com.github.developermobile.citiesapi.distances.controller;

import com.github.developermobile.citiesapi.distances.domain.Distance;
import com.github.developermobile.citiesapi.distances.service.DistanceService;
import com.github.developermobile.citiesapi.distances.service.EarthRadius;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/distances")
public class DistanceController {

  Logger log = LoggerFactory.getLogger(DistanceController.class);

  @Autowired
  public DistanceService service;

  @GetMapping("/by-points")
  public Distance byPoints(@RequestParam(name = "from") final Long city1,
                                           @RequestParam(name = "to") final Long city2) {
    log.info("byPoints");
    return Distance.builder()
            .distance(service.distanceByPointsInMiles(city1, city2))
            .build();
  }

  @GetMapping("/by-cube")
  public Distance byCube(@RequestParam(name = "from") final Long city1,
                       @RequestParam(name = "to") final Long city2) {
    log.info("byCube");
    return Distance.builder()
            .distance(service.distanceByCubeInMeters(city1, city2))
            .build();
  }

  @GetMapping("/by-math")
  public Double byMath(@RequestParam(name = "from") final Long city1,
                                @RequestParam(name = "to") final Long city2,
                                @RequestParam final EarthRadius unit) {
    log.info("byMath");
    return service.distanceUsingMath(city1, city2, unit);
  }
}
