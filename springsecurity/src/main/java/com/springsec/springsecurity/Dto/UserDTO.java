package com.springsec.springsecurity.Dto;

import jakarta.persistence.Column;

public class UserDTO {

    private int user_id;

    private String first_name;
    
    
    private String last_name;

    
    private String email;

    
 
    private String password;



    
    public UserDTO(int user_id, String first_name, String last_name, String email, String password) {
        this.user_id = user_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
    }

    public UserDTO(){

    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
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


    @Override
    public String toString(){
        return "User{"+
                "user_id=" + user_id+
                ", first_name=" + first_name+ '\''+
                ", last_name=" + last_name+ '\''+
                ", email='" +email+ '\''+
                ", password='" +password+ '\''+
                '}';
    }
    
}
