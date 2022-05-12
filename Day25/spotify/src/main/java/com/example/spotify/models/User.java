package com.example.spotify.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class User {
    
    private Long Id;
    private String username;
    private String password;

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public User (Long id, String username, String password){
        this.Id = id;
        this.username = username;
        this.password = password;
    }
}
