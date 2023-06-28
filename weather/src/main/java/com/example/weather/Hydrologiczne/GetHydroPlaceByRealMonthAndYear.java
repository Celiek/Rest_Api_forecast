package com.example.weather.Hydrologiczne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path="api/hydro")
public class GetHydroPlaceByRealMonthAndYear {
    @Autowired
    private HydroRepository hydroRepository;
    @GetMapping("/placebyrealmonthandyear")
    public List<HydroKlimat> findHydroPlaceByRealMonthAndYear(@RequestParam(value="api", defaultValue = "123") String api,
                                                              @RequestParam(value = "place" , defaultValue = "OLZA") String place,
                                                              @RequestParam(value = "year" , defaultValue = "2017") int year,
                                                              @RequestParam(value = "month" , defaultValue = "8") int month,
                                                              @RequestParam(value = "day" , defaultValue = "1") int day) {

        List<HydroKlimat> hydro = hydroRepository.findHydroPlaceByRealMonthAndYear( api, place, year, month, day);
        return hydro;
    }
}
