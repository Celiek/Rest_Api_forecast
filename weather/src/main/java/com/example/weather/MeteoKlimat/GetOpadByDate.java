package com.example.weather.MeteoKlimat;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/klimat")
public class GetOpadByDate {
    @Autowired
    private KlimatRepository klimatRepository;

    @GetMapping("/bydate")
    public List<KlimatOpad> findOpadByDate( @RequestParam(value="api" , defaultValue = "123") String api,
                                           @RequestParam(value = "place" , defaultValue = "WARSZOWICE") String place,
                                           int year
                                           ){
        LocalDate currentDate = LocalDate.now();
        int day = currentDate.getDayOfMonth();
        int month = currentDate.getMonthValue();

        List<KlimatOpad> klimat = klimatRepository.findOpadByDate(api, place, 2018, 12, 20);

        return klimat;
    }
}
