package com.example.weather.StacjeHydro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HydroStationRepository extends JpaRepository<HydroStations,Long> {

    @Query(value = "SELECT kod_piecioznakowy , nazwa_stacji FROM wykaz_stacji_hydrologicznych " , nativeQuery = true)
    List<HydroStations> getHydroStation();
}
