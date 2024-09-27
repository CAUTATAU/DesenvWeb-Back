package com.example.Back_end.Web.Controller;

import com.example.Back_end.Web.User.UserData;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/User")
public class UserController {

    @PostMapping
    public String addCliente(@RequestBody UserData dados){
        System.out.println(dados);
        return "Cliente adicionado com sucesso!";
    }

}
