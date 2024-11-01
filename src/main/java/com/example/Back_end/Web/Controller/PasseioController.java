package com.example.Back_end.Web.Controller;

import com.example.Back_end.Web.DTOs.CreatePasseioDTO;
import com.example.Back_end.Web.Entities.Passeio.Passeio;
import com.example.Back_end.Web.Services.PasseioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/passeio")
public class PasseioController {
    @Autowired
    PasseioService passeioService;

    @PostMapping()
    public ResponseEntity<Passeio> createPasseio(@RequestBody CreatePasseioDTO data){
       Passeio passeio = passeioService.createPasseio(data);
        return ResponseEntity.ok(passeio);
    }
}
