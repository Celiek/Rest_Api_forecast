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
public class GetMeteoByDate {
    @Autowired
    private OpadRepository opadRepository;

    @GetMapping("/bydate")
    public List<MeteoKlimat> findMeteoByDate(@RequestParam(value = "api") String api,
                                             @RequestParam(value = "place") String place){
        //dzisiejsza data
        LocalDate currentDate = LocalDate.now();
        int day = currentDate.getDayOfMonth();
        int month = currentDate.getMonthValue();
        int year = currentDate.getYear();

        List<MeteoKlimat> klimat = opadRepository.
                findMeteoByDate("123", "BIAŁOWIEŻA",2022, 5, 20);
        return klimat;
    }
}
