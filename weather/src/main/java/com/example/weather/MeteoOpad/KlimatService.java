package com.example.weather.MeteoOpad;

import com.example.weather.MeteoKlimat.KlimatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KlimatService {
    private final OpadRepository opadRepository;

    @Autowired
    public KlimatService(OpadRepository opadRepository) {
        this.opadRepository = opadRepository;
    }

    //zwraca liste stacji
    public List<MeteoKlimat> getNazwa_stacji(){
        return opadRepository.findAll();
    }
}
