package com.example.weather.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<User, Long> {

    //query wyszukujace wszystkie dane z native SQL
    @Query( value = "SELECT * FROM \"dane uzytkownikow\" WHERE u.email = :email",
            nativeQuery = true)
    Optional<User> findUserByEmail(@Param("email") String email);

    /*
    @Query("SELECT s FROM dane_uzytkownikow WHERE s.id = :id")
    Optional<User> findUserById(@Param("id") int id);
    */
}
