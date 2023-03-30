package com.example.weather.User;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner commandLineRunner(UsersRepository repository){
        return args -> {
            User gabriel = new User( "Gabriel","haslo123","123","Gabriel",1l,"g@google.com");
            repository.saveAll(List.of(gabriel));
        };
    }
}
