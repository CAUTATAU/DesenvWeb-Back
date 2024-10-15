package com.example.Back_end.Web.Services;


import com.example.Back_end.Web.DTOs.NewUserDTO;
import com.example.Back_end.Web.Entities.User.User;
import com.example.Back_end.Web.Entities.User.UserFactory;
import com.example.Back_end.Web.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserFactory userFactory;
    @Autowired
    PasswordEncoder passwordEncoder;

    public User createUser(NewUserDTO newUserDTO) {
        User newUser = userFactory.createUser(newUserDTO);
        newUser.setSenha(passwordEncoder.encode(newUser.getSenha()));
        return userRepository.save(newUser);
    }


}
