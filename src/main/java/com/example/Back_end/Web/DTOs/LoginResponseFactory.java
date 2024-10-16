package com.example.Back_end.Web.DTOs;

import com.example.Back_end.Web.Entities.User.Role;
import org.springframework.stereotype.Component;

@Component
public class LoginResponseFactory implements DTOFactory{
    @Override
    public LoginResponseDTO createLoginResponseDTO(String email, Role role) {
        return new LoginResponseDTO(email, role);
    }
}
