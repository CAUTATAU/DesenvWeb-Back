package com.example.Back_end.Web.Controller;
import com.example.Back_end.Web.DTOs.NewUserDTO;
import com.example.Back_end.Web.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping()
    public ResponseEntity<String> createUser(@RequestBody NewUserDTO data) {
        userService.createUser(data);
        return ResponseEntity.ok("eu aceito esse usuario, obrigado. COloquei ele no banco");
    }

}