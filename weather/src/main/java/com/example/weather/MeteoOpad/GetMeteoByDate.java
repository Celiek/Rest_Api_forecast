package com.example.weather.MeteoOpad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/meteo")
public class GetMeteoByDate {
    @Autowired
    private OpadRepository meteoRepository;

    @GetMapping("/opadbydate")
    public List<MeteoKlimat> findMeteoByDate(String api_key, String place){
        //dzisiejsza data
        LocalDate currentDate = LocalDate.now();
        int day = currentDate.getDayOfMonth();
        int month = currentDate.getMonthValue();
        int year = currentDate.getYear();

        List<MeteoKlimat> klimat = meteoRepository.
                findMeteoByDate(api_key, place,year, month, day);
        return klimat;
    }
}
