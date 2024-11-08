package com.example.Back_end.Web.DTOs;

import org.springframework.stereotype.Component;

@Component
public class LoginResponseFactory implements DTOFactory{
    @Override
    public LoginResponseDTO createLoginResponseDTO(String name,String token){
        return new LoginResponseDTO(name,token);
    }
}
