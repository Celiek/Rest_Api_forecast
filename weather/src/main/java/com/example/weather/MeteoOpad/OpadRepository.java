package com.example.weather.MeteoOpad;

import com.example.weather.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OpadRepository extends JpaRepository<MeteoKlimat, Long> {
    @Query( value = "SELECT * FROM dane_meteorologiczne_klimat h " +
            " WHERE EXISTS (SELECT * FROM dane_uzytkownikow u WHERE u.api_key = :api ) " +
            " AND h.nazwa_stacji = :place AND h.rok = :rok AND h.miesiac = :miesiac AND h.dzien = :dzien"
            , nativeQuery = true)
    List <MeteoKlimat> findMeteoByDate(@Param("api") String api,
                                    @Param("place") String place,
                                    @Param("rok") int rok,
                                    @Param("miesiac") int miesiac,
                                    @Param("dzien") int dzien);

    //funkcja ma pobierac dane meteorologiczo opadowe z dnia i miesiaca aktualnego i z roku 2021

    @Query( value = "SELECT * FROM dane_meteorologiczne_klimat h " +
            " WHERE EXISTS (SELECT * FROM dane_uzytkownikow u WHERE u.api_key = :api ) " +
            " AND h.nazwa_stacji = :place AND h.rok = 2021 AND h.miesiac = :miesiac AND h.dzien = :dzien "
            , nativeQuery = true)
    List<MeteoKlimat> findMeteoOpadByPlace(@Param("api") String api,
                                           @Param("place") String place,
                                           @Param("miesiac") int miesiac,
                                           @Param("dzien") int dzien);

}
