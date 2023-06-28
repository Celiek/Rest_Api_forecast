package com.example.weather.MeteoKlimat;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface KlimatRepository extends JpaRepository<KlimatOpad,Long> {
    @Query(value ="SELECT * FROM dane_meteorologiczne_opad h " +
            "WHERE EXISTS (SELECT * FROM dane_uzytkownikow u WHERE u.api_key = :api) " +
            "AND h.nazwa_stacji = :place AND h.rok = :year AND h.miesiac = :month AND h.dzien = :day",
            nativeQuery = true)
    List<KlimatOpad> findOpadByDate(@Param("api") String api,
                                    @Param("place") String place,
                                    @Param("year") int year,
                                    @Param("month") int month,
                                    @Param("day") int day);

    @Query(value = "SELECT * FROM dane_meteorologiczne_opad h " +
            "WHERE EXISTS (SELECT * FROM dane_uzytkownikow u WHERE u.api_key = :api) " +
            "AND h.nazwa_stacji = :place AND h.rok = 2018 AND h.miesiac = :month AND h.dzien = :day ",
            nativeQuery = true)
    List<KlimatOpad> findOpadByPlace(@Param("api") String api,
                                     @Param("place") String place,
                                     @Param("month") int month,
                                     @Param("day") int day);
}
