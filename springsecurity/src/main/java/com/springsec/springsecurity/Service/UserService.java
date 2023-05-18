package com.springsec.springsecurity.Service;

import com.springsec.springsecurity.Dto.LoginDTO;
import com.springsec.springsecurity.Dto.UserDTO;
import com.springsec.springsecurity.response.LoginResponse;

public interface UserService {

    String addUser(UserDTO userDTO);

   LoginResponse loginUser(LoginDTO loginDTO);
    
}
