package com.example.weather.Hydrologiczne;

import jakarta.persistence.*;

@Entity
@Table(name = "dane_hydrologiczne")
public class HydroKlimat {
    @Id
    private Long kod_stacji;
    private String nazwa_stacji;

    //@Column(columnDefinition = "VARCHAR(50)")
    private String nazwa_rzeki_lub_jeziora;

    private int rok_hydrologiczny;
    private int wskaznik_miesiaca_w_roku_hydrologicznym;
    private int dzien;

    public HydroKlimat()
    {

    }

    public HydroKlimat(Long kod_stacji, String nazwa_stacji, String nazwa_rzeki_kub_jeziora, int rok_hydrologiczny, int wskaznik_miesiaca_w_roku_hydrologicznym, int dzien, int stan_wody, float przeplyw_wody, float temperatura_wody, int miesiac_kalendarzowy) {
        this.kod_stacji = kod_stacji;
        this.nazwa_stacji = nazwa_stacji;
        this.nazwa_rzeki_lub_jeziora = nazwa_rzeki_kub_jeziora;
        this.rok_hydrologiczny = rok_hydrologiczny;
        this.wskaznik_miesiaca_w_roku_hydrologicznym = wskaznik_miesiaca_w_roku_hydrologicznym;
        this.dzien = dzien;
        this.stan_wody = stan_wody;
        this.przeplyw_wody = przeplyw_wody;
        this.temperatura_wody = temperatura_wody;
        this.miesiac_kalendarzowy = miesiac_kalendarzowy;
    }

    private int stan_wody;
    private float przeplyw_wody;

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

    public String getNazwa_rzeki_kub_jeziora() {
        return nazwa_rzeki_lub_jeziora;
    }

    public void setNazwa_rzeki_kub_jeziora(String nazwa_rzeki_kub_jeziora) {
        this.nazwa_rzeki_lub_jeziora = nazwa_rzeki_kub_jeziora;
    }

    public int getRok_hydrologiczny() {
        return rok_hydrologiczny;
    }

    public void setRok_hydrologiczny(int rok_hydrologiczny) {
        this.rok_hydrologiczny = rok_hydrologiczny;
    }

    public int getWskaznik_miesiaca_w_roky_hydrologicznym() {
        return wskaznik_miesiaca_w_roku_hydrologicznym;
    }

    public void setWskaznik_miesiaca_w_roky_hydrologicznym(int wskaznik_miesiaca_w_roky_hydrologicznym) {
        this.wskaznik_miesiaca_w_roku_hydrologicznym = wskaznik_miesiaca_w_roky_hydrologicznym;
    }

    public int getDzien() {
        return dzien;
    }

    public void setDzien(int dzien) {
        this.dzien = dzien;
    }

    public float getStan_wody() {
        return stan_wody;
    }

    public void setStan_wody(int stan_wody) {
        this.stan_wody = stan_wody;
    }

    public float getPrzeplyw_wody() {
        return przeplyw_wody;
    }

    public void setPrzeplyw_wody(float przeplyw_wody) {
        this.przeplyw_wody = przeplyw_wody;
    }

    public float getTemperatura_wody() {
        return temperatura_wody;
    }

    public void setTemperatura_wody(float temperatura_wody) {
        this.temperatura_wody = temperatura_wody;
    }

    public int getMiesiac_kalendarzowy() {
        return miesiac_kalendarzowy;
    }

    public void setMiesiac_kalendarzowy(int miesiac_kalendarzowy) {
        this.miesiac_kalendarzowy = miesiac_kalendarzowy;
    }

    private float temperatura_wody;
    private int miesiac_kalendarzowy;

}