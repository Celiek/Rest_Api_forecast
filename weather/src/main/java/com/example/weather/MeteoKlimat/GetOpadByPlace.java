package com.example.weather.MeteoKlimat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path="api/klimat")
public class GetOpadByPlace {
    @Autowired
    private KlimatRepository klimatRepository;
    @GetMapping("/byplace")
    public List<KlimatOpad> findOpadByPlace(@RequestParam(value = "api" , defaultValue = "123") String api,
                                            @RequestParam(value = "place" , defaultValue = "WARSZOWICE") String place){
        LocalDate currentDate = LocalDate.now();
        int day = currentDate.getDayOfMonth();
        int month = currentDate.getMonthValue();
        //for testing purpose only
        List<KlimatOpad> klimat = klimatRepository.findOpadByPlace(api,place,1,3);
        return klimat;
    }

}
