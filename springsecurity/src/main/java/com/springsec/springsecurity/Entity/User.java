package com.springsec.springsecurity.Entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "paymentUsers")
public class User {
    
    @Id
    @Column(name = "user_id", length = 255)
    @GeneratedValue(strategy =GenerationType.AUTO)
    private int user_id;


    @Column(name ="first_name", length = 255)
    private String first_name;
    

    @Column(name ="last_name", length = 255)
    private String last_name;
    

    @Column(name ="email", length = 255)
    private String email;
    

    @Column(name ="password", length = 255)
    private String password;



    public User(int user_id, String first_name, String last_name, String email, String password) {
        this.user_id = user_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
    }
    
    public User(){
        
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
