package com.example.weather.MeteoKlimat;

import com.example.weather.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface KlimatRepository extends JpaRepository<User,Long> {
    @Query(value ="SELECT *\n" +
            "FROM \"dane meteorologiczne opad\" h\n" +
            "WHERE EXISTS (SELECT * FROM \"dane uzytkownikow\" u WHERE u.api = :id)\n" +
            "AND h.\"nazwa stacji\" = :place AND h.\"rok\" = :year AND h.\"miesiac\" = :month AND h.\"dzien\" = :day;",
            nativeQuery = true)
    List<KlimatOpad> findOpadByDate(@Param("id") int id,
                                    @Param("place") String place,
                                    @Param("year") int year,
                                    @Param("month") int month,
                                    @Param("day") int day);

    //tutaj koniec 23.05.2023
    @Query(value = "SELECT *\n" +
            "FROM \"dane meteorologiczne klimat\" h" +
            "WHERE EXISTS (SELECT * FROM \"dane uzytkownikow\" u WHERE u.api_key = :api)" +
            "AND h.\"nazwa stacji\" = :place AND h.\"rok\" = 2021 AND h.\"miesiac\" = :month AND h.\"dzien\" = :day;" +
            "meteorologiczne ")
    List<KlimatOpad> findOpadByPlace(@Param("api_key") int api,
                                     @Param("place") String place,
                                     @Param("month") int month,
                                     @Param("day") int day);
}
