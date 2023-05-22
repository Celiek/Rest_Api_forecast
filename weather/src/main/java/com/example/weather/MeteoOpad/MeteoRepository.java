package com.example.weather.MeteoOpad;

import com.example.weather.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface MeteoRepository extends JpaRepository<User, Long> {
    @Query( value = "SELECT *\n" +
            "FROM \"dane meteorologiczne klimat\" h" +
            "WHERE EXISTS (SELECT * FROM \"dane uzytkownikow\" u WHERE u.email = 'g@google.com')\n" +
            "AND h.\"nazwa stacji\" = 'PSZCZYNA' AND h.\"rok\" = :rok AND h.\"miesiac\" = :miesiac AND h.\"dzien\" = :dzien )"
            , nativeQuery = true)
    Optional <MeteoKlimat> findMeteoByDate(@Param("email") String email,
                                    @Param("rok") String rok,
                                    @Param("miesiac") String miesiac,
                                    @Param("dzien") String dzien);


    //Optional <User>


}
