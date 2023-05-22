package com.example.weather.MeteoOpad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;

import java.util.List;

public class MeteoKlimatService {
    private final MeteoRepository meteoRepository;

    @Autowired
    public MeteoKlimatService(MeteoRepository meteoRepository) {
        this.meteoRepository = meteoRepository;
    }

    public List<MeteoRepository> getMeteoData( String email, String rok, String miesiac, String dzien){
        return meteoRepository.findMeteoByDate(email, rok, miesiac, dzien);
    }


}
