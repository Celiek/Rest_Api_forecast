package com.example.weather.MeteoOpad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/opad")
public class GetMeteoByPlace {

    @Autowired
    private OpadRepository meteoRepository;

    @GetMapping("/place")
    public List<MeteoKlimat> findMeteoOpadByPlace(String api_key, String place){
        //dane daty
        LocalDate currentDate = LocalDate.now();
        int day = currentDate.getDayOfMonth();
        int month = currentDate.getMonthValue();

        List<MeteoKlimat> meteo = meteoRepository.
                findMeteoOpadByPlace( api_key,  place,  month,  day );
        return meteo;
    }
}
