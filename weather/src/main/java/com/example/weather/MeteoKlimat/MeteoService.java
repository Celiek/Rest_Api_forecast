package com.example.weather.MeteoKlimat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeteoService {
    private final KlimatRepository klimatRepository;

    @Autowired
    public MeteoService(KlimatRepository klimatRepository) {
        this.klimatRepository = klimatRepository;
    }

    public List<KlimatOpad> getNazwaStacji(){
        return klimatRepository.findAll();
    }
}
