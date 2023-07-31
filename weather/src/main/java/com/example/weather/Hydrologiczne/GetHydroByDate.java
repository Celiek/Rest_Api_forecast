package com.example.weather.Hydrologiczne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path="api/hydro")
public class GetHydroByDate {
    @Autowired
    private HydroRepository hydroRepository;
    @GetMapping("/bydate")
    public List<HydroKlimat> findHydroByDate( @RequestParam(value = "api" , defaultValue = "123") String api,
                                              @RequestParam(value = "place" , defaultValue = "CHAŁUPKI") String place,
                                              @RequestParam(value ="year" , defaultValue = "2017") int year){
        LocalDate currentDate = LocalDate.now();
        int day = currentDate.getDayOfMonth();
        int month = currentDate.getMonthValue();

        List<HydroKlimat> hydro = hydroRepository.findHydroByDate( api, place, year, month, day);
        return hydro;
    }
}
