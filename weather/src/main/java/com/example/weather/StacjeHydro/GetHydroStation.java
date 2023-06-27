package com.example.weather.StacjeHydro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(path = "/api/hydro")
public class GetHydroStation {
    @Autowired
    private HydroStationRepository hydroStationRepository;
    @GetMapping("/stations")
    public List<HydroStations> getAllStations(){
        List<HydroStations> hydro = hydroStationRepository.getHydroStation();
        return hydro;
    }
}
