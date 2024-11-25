package com.example.Back_end.Web.DTOs;


import com.example.Back_end.Web.Entities.User.Role;

public interface DTOFactory {
    LoginResponseDTO createLoginResponseDTO(String name, Role role, String token);
}
