package pl.badjuice.sivents.auth.domain;

import org.springframework.data.annotation.Id;

public class User {

    @Id
    public final String username;

    public User(String username) {
        this.username = username;
    }
}
