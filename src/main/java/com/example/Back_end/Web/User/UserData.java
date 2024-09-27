package com.example.Back_end.Web.User;

import java.util.Date;

public record UserData(String firstName, String lastName, String email, String password, String birthday,String CPF, UserType userType) {
}

//json:
//{"firstName": "Patolino", "lastName": " Pacheco","email": "yetesfqsd@gmail.com","birthday": "2055/03/28","password": "senha","CPF": "123456","userType": "USER"}