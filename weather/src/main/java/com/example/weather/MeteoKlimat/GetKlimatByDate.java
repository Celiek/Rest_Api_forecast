package com.example.weather.MeteoKlimat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/klimat")
public class GetKlimatByDate {
    @Autowired
    private KlimatRepository klimatRepository;
    @GetMapping("/bydate")
    public List<KlimatOpad> findKlimatByDate(String api_key, String place, int year){
        LocalDate currentDate = LocalDate.now();
        int day = currentDate.getDayOfMonth();
        int month = currentDate.getMonthValue();

        List<KlimatOpad> opad = klimatRepository.findOpadByDate(api_key, place,year,month,day);

        return opad;
    }
}
