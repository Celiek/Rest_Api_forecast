package com.example.weather.MeteoKlimat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "/api/klimat")
public class GetKlimatByPlace {

    @Autowired
    private KlimatRepository klimatRepository;

    @GetMapping("/byplace")
    public List<KlimatOpad> findKlimatByPlace(String api_key, String place){
        LocalDate currentDate = LocalDate.now();
        int day = currentDate.getDayOfMonth();
        int month = currentDate.getMonthValue();

        List<KlimatOpad> klimat = klimatRepository.findOpadByPlace(api_key, place, month, day);
        return klimat;
    }
}
