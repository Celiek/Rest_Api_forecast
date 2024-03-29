package com.example.weather.MeteoOpad;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "dane_meteorologiczne_klimat")
public class MeteoKlimat {
    @Id
    private Long kod_stacji;
    private String nazwa_stacji;
    private int rok;
    private byte miesiac;
    private byte dzien;
    private float maksymalna_temperatura_dobowa;
    private int tmax;
    private float minimalna_temperatura_dobowa;
    private Integer tmin;
    private float srednia_temperatura_dobowa;
    private byte STD;
    private float temperatura_minimalna_przy_gruncie;
    private byte tmng;
    private double suma_dobowa_opadow;
    private int SMDB;
    private char rodzaj_opadu_SMDB;
    private int wysokosc_pokrywy_snieznej;
    private byte PKSN;

    public MeteoKlimat(Long kod_stacji, String nazwa_stacji,
                       int rok, byte miesiac,
                       byte dzien, float maksymalna_temperatura_dobowa,
                       int tmax, float minimalna_temperatura_dobowa,
                       Integer tmin, float srednia_temperatura_dobowa,
                       byte STD, float temperatura_minimalna_przy_gruncie,
                       byte tmng, double suma_dobowa_opadow, int SMDB,
                       char rodzaj_opadu_SMDB, int wysokosc_pokrywy_snieznej,
                       byte PKSN) {
        this.kod_stacji = kod_stacji;
        this.nazwa_stacji = nazwa_stacji;
        this.rok = rok;
        this.miesiac = miesiac;
        this.dzien = dzien;
        this.maksymalna_temperatura_dobowa = maksymalna_temperatura_dobowa;
        this.tmax = tmax;
        this.minimalna_temperatura_dobowa = minimalna_temperatura_dobowa;
        this.tmin = tmin;
        this.srednia_temperatura_dobowa = srednia_temperatura_dobowa;
        this.STD = STD;
        this.temperatura_minimalna_przy_gruncie = temperatura_minimalna_przy_gruncie;
        this.tmng = tmng;
        this.suma_dobowa_opadow = suma_dobowa_opadow;
        this.SMDB = SMDB;
        this.rodzaj_opadu_SMDB = rodzaj_opadu_SMDB;
        this.wysokosc_pokrywy_snieznej = wysokosc_pokrywy_snieznej;
        this.PKSN = PKSN;
    }

    public MeteoKlimat(){

    }

    public Long getKod_stacji() {
        return kod_stacji;
    }

    public String getNazwa_stacji() {
        return nazwa_stacji;
    }

    public long getRok() {
        return rok;
    }

    public byte getMiesiac() {
        return miesiac;
    }

    public byte getDzien() {
        return dzien;
    }

    public float getMaksymalna_temperatura_dobowa() {
        return maksymalna_temperatura_dobowa;
    }

    public int getTmax() {
        return tmax;
    }

    public float getMinimalna_temperatura_dobowa() {
        return minimalna_temperatura_dobowa;
    }

    public Integer getTmin() {
        return tmin;
    }

    public float getSrednia_temperatura_dobowa() {
        return srednia_temperatura_dobowa;
    }

    public byte getSTD() {
        return STD;
    }

    public float getTemperatura_minimalna_przy_gruncie() {
        return temperatura_minimalna_przy_gruncie;
    }

    public byte getTmng() {
        return tmng;
    }

    public double getSuma_dobowa_opadow() {
        return suma_dobowa_opadow;
    }

    public int getSMDB() {
        return SMDB;
    }

    public char getRodzaj_opadu_SMDB() {
        return rodzaj_opadu_SMDB;
    }

    public int getWysokosc_pokrywy_snieznej() {
        return wysokosc_pokrywy_snieznej;
    }

    public byte getPKSN() {
        return PKSN;
    }

    public void setKod_stacji(Long kod_stacji) {
        this.kod_stacji = kod_stacji;
    }

    public void setNazwa_stacji(String nazwa_stacji) {
        this.nazwa_stacji = nazwa_stacji;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public void setMiesiac(byte miesiac) {
        this.miesiac = miesiac;
    }

    public void setDzien(byte dzien) {
        this.dzien = dzien;
    }

    public void setMaksymalna_temperatura_dobowa(float maksymalna_temperatura_dobowa) {
        this.maksymalna_temperatura_dobowa = maksymalna_temperatura_dobowa;
    }

    public void setTmax(int tmax) {
        this.tmax = tmax;
    }

    public void setMinimalna_temperatura_dobowa(float minimalna_temperatura_dobowa) {
        this.minimalna_temperatura_dobowa = minimalna_temperatura_dobowa;
    }

    public void setTmin(Integer tmin) {
        this.tmin = tmin;
    }

    public void setSrednia_temperatura_dobowa(float srednia_temperatura_dobowa) {
        this.srednia_temperatura_dobowa = srednia_temperatura_dobowa;
    }

    public void setSTD(byte STD) {
        this.STD = STD;
    }

    public void setTemperatura_minimalna_przy_gruncie(float temperatura_minimalna_przy_gruncie) {
        this.temperatura_minimalna_przy_gruncie = temperatura_minimalna_przy_gruncie;
    }

    public void setTmng(byte tmng) {
        this.tmng = tmng;
    }

    public void setSuma_dobowa_opadow(double suma_dobowa_opadow) {
        this.suma_dobowa_opadow = suma_dobowa_opadow;
    }

    public void setSMDB(int SMDB) {
        this.SMDB = SMDB;
    }

    public void setRodzaj_opadu_SMDB(char rodzaj_opadu_SMDB) {
        this.rodzaj_opadu_SMDB = rodzaj_opadu_SMDB;
    }

    public void setWysokosc_pokrywy_snieznej(int wysokosc_pokrywy_snieznej) {
        this.wysokosc_pokrywy_snieznej = wysokosc_pokrywy_snieznej;
    }

    public void setPKSN(byte PKSN) {
        this.PKSN = PKSN;
    }

}
