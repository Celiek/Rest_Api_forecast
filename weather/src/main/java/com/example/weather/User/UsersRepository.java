package com.example.weather.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<User, Long> {

    @Query("SELECT s FROM Users s WHERE s.email = ?1 AND s.password = ?2")
    Optional<User> findUserByEmail(String email);
}
