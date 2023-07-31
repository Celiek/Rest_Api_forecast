package com.example.weather.StacjeHydro;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="wykaz_stacji_hydrologicznych")
public class HydroStations {
    @Id
    private int kod_piecioznakowy;
    private String nazwa_stacji;


    public int getKod_piecioznakowy() {
        return kod_piecioznakowy;
    }

    public void setKod_piecioznakowy(int kod_piecioznakowy) {
        this.kod_piecioznakowy = kod_piecioznakowy;
    }

    public String getNazwa_stacji() {
        return nazwa_stacji;
    }

    public void setNazwa_stacji(String nazwa_stacji) {
        this.nazwa_stacji = nazwa_stacji;
    }

    public HydroStations(int kod_piecioznakowy, String nazwa_stacji) {
        this.kod_piecioznakowy = kod_piecioznakowy;
        this.nazwa_stacji = nazwa_stacji;
    }

    public HydroStations(){

    }
}
