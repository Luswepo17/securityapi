package com.springsec.springsecurity.Service.implementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.springsec.springsecurity.Dto.LoginDTO;
import com.springsec.springsecurity.Dto.UserDTO;
import com.springsec.springsecurity.Entity.User;
import com.springsec.springsecurity.Repository.UserRepo;
import com.springsec.springsecurity.Service.UserService;
import com.springsec.springsecurity.response.LoginResponse;

@Service
public class UserIMPL implements UserService{


    @Autowired
    private UserRepo userRepo;
    
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String addUser(UserDTO userDTO) {

        passwordEncoder = new BCryptPasswordEncoder();

        User user = new User(

        userDTO.getUser_id(),
        userDTO.getFirst_name(),
        userDTO.getLast_name(),
        userDTO.getEmail(),
        this.passwordEncoder.encode(userDTO.getPassword())   
        );
        
        userRepo.save(user);
        return user.getFirst_name();
    }

        UserDTO userDTO;
    


    @Override
    public LoginResponse loginUser(LoginDTO loginDTO) {
        String msg = "";
        User user1 = userRepo.findByEmail(loginDTO.getEmail());
        if (user1 != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = user1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<User> user = userRepo.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
                if (user.isPresent()) {
                    return new LoginResponse("Login Success", "true");
                } else {
                    return new LoginResponse("Login Failed", "false");
                }
            } else {
 
                return new LoginResponse("password Not Match", "false");
            }
        }else {
            return new LoginResponse("Email not exits", "false");
        }
    
    }

}

