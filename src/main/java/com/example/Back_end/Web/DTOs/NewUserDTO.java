package com.example.Back_end.Web.DTOs;

import com.example.Back_end.Web.Entities.User.Role;
import lombok.Setter;


public record NewUserDTO(
        String nome,
        String email,
        String senha,
        String dataNascimento,
        String cpf,
        Role role
) {
}
