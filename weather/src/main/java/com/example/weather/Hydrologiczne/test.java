package com.example.weather.Hydrologiczne;

import com.example.weather.MeteoKlimat.KlimatOpad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;
@RestController
@RequestMapping(path = "api/hydro")
public class test {
    @Autowired
    private HydroRepository hydroRepository;
    @GetMapping("/test")
    public List<HydroKlimat> test(){

        List<HydroKlimat> hydro = hydroRepository.test();

        return hydro;
    }
}
