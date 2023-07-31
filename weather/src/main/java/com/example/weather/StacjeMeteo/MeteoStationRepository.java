package com.example.weather.StacjeMeteo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MeteoStationRepository extends JpaRepository<MeteoStations,Long> {

    @Query(value = "SELECT kod_stacji, nazwa_stacji FROM wykaz_stacji_meteorologicznych",nativeQuery = true)
    List<MeteoStations> findMeteoStations();
}
