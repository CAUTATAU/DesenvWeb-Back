package com.example.Back_end.Web.DTOs;



public interface DTOFactory {
    LoginResponseDTO createLoginResponseDTO(String name, String token);
}
