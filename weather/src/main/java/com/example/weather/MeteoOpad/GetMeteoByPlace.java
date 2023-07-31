package com.example.weather.MeteoOpad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/meteo")
public class GetMeteoByPlace {

    @Autowired
    private OpadRepository meteoRepository;

    @GetMapping("/byplace")
    public List<MeteoKlimat> findMeteoOpadByPlace(@RequestParam(value = "api") String api,
                                                  @RequestParam(value = "place") String place){

        LocalDate currentDate = LocalDate.now();
        int day = currentDate.getDayOfMonth();
        int month = currentDate.getMonthValue();

        List<MeteoKlimat> meteo = meteoRepository.
                findMeteoOpadByPlace( "123",  "BIAŁOWIEŻA",  5,  20 );
        return meteo;
    }
}
