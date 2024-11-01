package com.example.Back_end.Web.Services;

import com.example.Back_end.Web.DTOs.CreatePasseioDTO;
import com.example.Back_end.Web.Entities.Passeio.Passeio;
import com.example.Back_end.Web.Repositories.PasseioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PasseioService {
    @Autowired
    PasseioRepository passeioRepository;

    public Passeio createPasseio(CreatePasseioDTO passeioData){
        return passeioRepository.save(new Passeio(passeioData));
    }




}
