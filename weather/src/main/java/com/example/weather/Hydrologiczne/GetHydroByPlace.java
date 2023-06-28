package com.example.weather.Hydrologiczne;

import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

import java.util.List;

@RestController
@RequestMapping(path="api/hydro")
public class GetHydroByPlace {

    @Autowired
    private HydroRepository hydroRepository;

    @GetMapping("/byplace")
    public List<HydroKlimat> findHydroByPlace(@RequestParam(value = "api", defaultValue = "123") String api,
                                              @RequestParam(value = "place", defaultValue = "CHAŁUPKI") String place){
        LocalDate currentdate = LocalDate.now();
        int day = currentdate.getDayOfMonth();
        int month = currentdate.getDayOfMonth();

        List<HydroKlimat> hydro = hydroRepository.findHydroByPlace(api,place,month,day);
        return hydro;
    }

}
