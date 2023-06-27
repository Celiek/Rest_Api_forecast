package com.example.weather.Hydrologiczne;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HydroService {
    private final HydroRepository hydroRepository;

    public HydroService(HydroRepository hydroRepository) {
        this.hydroRepository = hydroRepository;
    }

    public List<HydroKlimat> getStationNames(){
        return hydroRepository.findAll();
    }
}
