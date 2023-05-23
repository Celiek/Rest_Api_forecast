package com.example.weather.MeteoOpad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeteoKlimatService {
    private final OpadRepository meteoRepository;

    @Autowired
    public MeteoKlimatService(OpadRepository meteoRepository) {
        this.meteoRepository = meteoRepository;
    }

    public List<MeteoKlimat> getMeteoData(String api_key, String place, int rok, int miesiac, int dzien){
        return meteoRepository.findMeteoByDate(api_key, place, rok, miesiac, dzien);
    }


}
