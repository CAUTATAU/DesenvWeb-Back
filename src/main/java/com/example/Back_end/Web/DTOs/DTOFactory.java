package com.example.Back_end.Web.DTOs;

import com.example.Back_end.Web.Entities.User.Role;
import org.springframework.stereotype.Component;


public interface DTOFactory {
    LoginResponseDTO createLoginResponseDTO(String name,String email, Role role);
}
