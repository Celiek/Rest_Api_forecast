package com.example.weather.Hydrologiczne;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface HydroRepository extends JpaRepository<HydroKlimat, Long> {

    @Query(value = "SELECT * FROM dane_hydrologiczne h " +
            "WHERE EXISTS (SELECT * FROM dane_uzytkownikow u WHERE u.api_key = :api) " +
            "AND h.nazwa_stacji = :place AND h.rok_hydrologiczny = :year AND " +
            "h.wskaznik_miesiaca_w_roku_hydrologicznym = :month AND h.dzien = :day",
            nativeQuery = true)
    List<HydroKlimat> findHydroByDate(@Param("api") String api,
                                      @Param("place") String place,
                                      @Param("year") int year,
                                      @Param("month")int month,
                                      @Param("day") int day);

    @Query(value = "SELECT * FROM dane_hydrologiczne h " +
            "WHERE EXISTS (SELECT * FROM dane_uzytkownikow u WHERE u.api_key = :api) " +
            "AND h.nazwa_stacji = :place AND h.rok_hydrologiczny = 2018 " +
            "AND h.wskaznik_miesiaca_w_roku_hydrologicznym = :month AND h.dzien = :day" ,
            nativeQuery = true)
    List<HydroKlimat> findHydroByPlace(@Param("api") String api,
                                       @Param("place") String place,
                                       @Param("month") int month,
                                       @Param("day") int day);


    //Query zwaracające wszystkie dane
    //dla tabeli dane hydrologiczne z podanymi parametrami.
    @Query(value = "SELECT * FROM dane_hydrologiczne h " +
            "WHERE EXISTS (SELECT * FROM dane_uzytkownikow u WHERE u.api_key = :api )" +
            "AND h.nazwa_stacji = :place AND h.rok_hydrologiczny = :year AND h.miesiac_kalendarzowy = :month AND h.dzien = :day",
            nativeQuery = true)
    List<HydroKlimat> findHydroPlaceByRealMonthAndYear(@Param("api") String api,
                                                       @Param("place") String place,
                                                       @Param("year") int year,
                                                       @Param("month")int month,
                                                       @Param("day") int day );
}