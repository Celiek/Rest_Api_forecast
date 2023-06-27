package com.example.weather.Hydrologiczne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path="api/hydro")
public class GetHydroByDate {
    @Autowired
    private HydroRepository hydroRepository;
    @GetMapping("/bydate")
    public List<HydroKlimat> findHydroByPlace(String api_key, String place, int year){
        LocalDate currentDate = LocalDate.now();
        int day = currentDate.getDayOfMonth();
        int month = currentDate.getMonthValue();

        List<HydroKlimat> hydro = hydroRepository.findHydroByDate(api_key, place, year,month,day);
        return hydro;
    }
}
