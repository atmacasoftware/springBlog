package net.atmacacode.blog.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Lob;
import net.atmacacode.blog.entities.Blog;
import net.atmacacode.blog.entities.User;

import java.time.LocalDateTime;

public class UserDTO {

    private long id;

    private String username;

    private String email;

    private String password;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User toUser(){
        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);

        return user;
    }
}
