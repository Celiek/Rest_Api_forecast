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
    public List<HydroKlimat> findHydroByPlace(@RequestParam("api_key") String api_key, @RequestParam("place") String place){
        LocalDate currentdate = LocalDate.now();
        int day = currentdate.getDayOfMonth();
        int month = currentdate.getDayOfMonth();

        List<HydroKlimat> hydro = hydroRepository.findHydroByPlace(api_key,place,month,day);
        return hydro;
    }

}
