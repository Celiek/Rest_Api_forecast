package com.example.weather.User;

import jakarta.persistence.*;

@Entity
@Table
public class User {
    private String login;
    private String password;
    private String apiKey;
    @Id
    @SequenceGenerator(
            name="user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator = "user_sequence")
    private Long id;

    private String email;

    public User(){

    }


    public User(String login, String password, String apiKey, Long id, String email) {
        this.login = login;
        this.password = password;
        this.apiKey = apiKey;
        this.id = id;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getApiKey() {
        return apiKey;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
