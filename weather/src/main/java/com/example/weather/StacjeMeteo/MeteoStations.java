package com.example.weather.StacjeMeteo;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Entity
@Table(name = "wykaz_stacji_meteorologicznych")
public class MeteoStations  {
    @Id
    private Long kod_stacji;
    private String nazwa_stacji;


    public Long getKod_stacji() {
        return kod_stacji;
    }

    public void setKod_stacji(Long kod_stacji) {
        this.kod_stacji = kod_stacji;
    }

    public String getNazwa_stacji() {
        return nazwa_stacji;
    }

    public void setNazwa_stacji(String nazwa_stacji) {
        this.nazwa_stacji = nazwa_stacji;
    }





    public MeteoStations(Long kod_stacji, String nazwa_stacji) {
        this.kod_stacji = kod_stacji;
        this.nazwa_stacji = nazwa_stacji;

    }

    public MeteoStations(){

    }
}
