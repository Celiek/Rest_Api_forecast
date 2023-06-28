package com.example.weather.MeteoOpad;

import com.example.weather.MeteoKlimat.KlimatOpad;
import com.example.weather.MeteoKlimat.KlimatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KlimatService {
    private final KlimatRepository klimatRepository;

    @Autowired
    public KlimatService(KlimatRepository klimatRepository) {
        this.klimatRepository = klimatRepository;
    }

    //zwraca liste stacji
    public List<KlimatOpad> getNazwa_stacji(){
        return klimatRepository.findAll();
    }
}
