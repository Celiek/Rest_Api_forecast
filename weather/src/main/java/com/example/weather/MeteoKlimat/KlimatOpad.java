package com.example.weather.MeteoKlimat;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="dane meteorologiczne ")
public class KlimatOpad {
    private Long kod_stacji;
    private int rok;

    public Long getKod_stacji() {
        return kod_stacji;
    }

    public void setKod_stacji(Long kod_stacji) {
        this.kod_stacji = kod_stacji;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public int getMiesiac() {
        return miesiac;
    }

    public void setMiesiac(int miesiac) {
        this.miesiac = miesiac;
    }

    public int getDzien() {
        return dzien;
    }

    public void setDzien(int dzien) {
        this.dzien = dzien;
    }

    public float getSuma_dobowa_opadow() {
        return suma_dobowa_opadow;
    }

    public void setSuma_dobowa_opadow(float suma_dobowa_opadow) {
        this.suma_dobowa_opadow = suma_dobowa_opadow;
    }

    public int getSMDB() {
        return SMDB;
    }

    public void setSMDB(int SMDB) {
        this.SMDB = SMDB;
    }

    public char getRodzaj_opadu() {
        return rodzaj_opadu;
    }

    public void setRodzaj_opadu(char rodzaj_opadu) {
        this.rodzaj_opadu = rodzaj_opadu;
    }

    public int getWysokosc_pokrywy_snieznej() {
        return wysokosc_pokrywy_snieznej;
    }

    public void setWysokosc_pokrywy_snieznej(int wysokosc_pokrywy_snieznej) {
        this.wysokosc_pokrywy_snieznej = wysokosc_pokrywy_snieznej;
    }

    public int getPKSN() {
        return PKSN;
    }

    public void setPKSN(int PKSN) {
        this.PKSN = PKSN;
    }

    public int getWysokosc_swiezospadlego_sniegu() {
        return wysokosc_swiezospadlego_sniegu;
    }

    public void setWysokosc_swiezospadlego_sniegu(int wysokosc_swiezospadlego_sniegu) {
        this.wysokosc_swiezospadlego_sniegu = wysokosc_swiezospadlego_sniegu;
    }

    public int getHSS() {
        return HSS;
    }

    public void setHSS(int HSS) {
        this.HSS = HSS;
    }

    public int getGatunek_sniegu() {
        return gatunek_sniegu;
    }

    public void setGatunek_sniegu(int gatunek_sniegu) {
        this.gatunek_sniegu = gatunek_sniegu;
    }

    public int getGATS() {
        return GATS;
    }

    public void setGATS(int GATS) {
        this.GATS = GATS;
    }

    public char getRodzaj_pokrywy_snieznej() {
        return rodzaj_pokrywy_snieznej;
    }

    public void setRodzaj_pokrywy_snieznej(char rodzaj_pokrywy_snieznej) {
        this.rodzaj_pokrywy_snieznej = rodzaj_pokrywy_snieznej;
    }

    private int miesiac;
    private int dzien;
    private float suma_dobowa_opadow;
    private int SMDB;
    private char rodzaj_opadu;
    private int wysokosc_pokrywy_snieznej;
    private int PKSN;
    private int wysokosc_swiezospadlego_sniegu;
    private int HSS;
    private int gatunek_sniegu;
    private int GATS;
    private char rodzaj_pokrywy_snieznej;

    public KlimatOpad(Long kod_stacji, int rok, int miesiac, int dzien, float suma_dobowa_opadow, int SMDB, char rodzaj_opadu, int wysokosc_pokrywy_snieznej, int PKSN, int wysokosc_swiezospadlego_sniegu, int HSS, int gatunek_sniegu, int GATS, char rodzaj_pokrywy_snieznej) {
        this.kod_stacji = kod_stacji;
        this.rok = rok;
        this.miesiac = miesiac;
        this.dzien = dzien;
        this.suma_dobowa_opadow = suma_dobowa_opadow;
        this.SMDB = SMDB;
        this.rodzaj_opadu = rodzaj_opadu;
        this.wysokosc_pokrywy_snieznej = wysokosc_pokrywy_snieznej;
        this.PKSN = PKSN;
        this.wysokosc_swiezospadlego_sniegu = wysokosc_swiezospadlego_sniegu;
        this.HSS = HSS;
        this.gatunek_sniegu = gatunek_sniegu;
        this.GATS = GATS;
        this.rodzaj_pokrywy_snieznej = rodzaj_pokrywy_snieznej;
    }
}
