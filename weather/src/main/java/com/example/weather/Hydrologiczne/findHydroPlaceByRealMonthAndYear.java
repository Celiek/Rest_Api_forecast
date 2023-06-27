package com.example.weather.Hydrologiczne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path="api/hydro")
public class findHydroPlaceByRealMonthAndYear {
    @Autowired
    private HydroRepository hydroRepository;
    @GetMapping("/placebyrealmonthandyear")
    public List<HydroKlimat> findHydroPlaceByRealMonthAndYear(String api_key, String place){
        LocalDate currentDate = LocalDate.now();
        int day = currentDate.getDayOfMonth();
        int month = currentDate.getDayOfMonth();
        int year = currentDate.getYear();

        List<HydroKlimat> hydro = hydroRepository.findHydroPlaceByRealMonthAndYear(api_key,place,year,month,day);
        return hydro;
    }
}
