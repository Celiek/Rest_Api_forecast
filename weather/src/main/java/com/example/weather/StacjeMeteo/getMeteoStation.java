package com.example.weather.StacjeMeteo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/meteo")
public class getMeteoStation {
    @Autowired
    private MeteoStationRepository meteoStationRepository;

    @GetMapping("/stations")
    public List<MeteoStations> getAllStations(){

        List<MeteoStations> meteo = meteoStationRepository.findMeteoStations();
        return meteo;
    }


}
