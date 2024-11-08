package com.example.Back_end.Web.Services;

import com.example.Back_end.Web.DTOs.ReservaDTO;
import com.example.Back_end.Web.Entities.Reserva.Reserva;
import com.example.Back_end.Web.Repositories.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ReservaService {
    @Autowired
    ReservaRepository reservaRepository;

    public Reserva createReserva(ReservaDTO reservaData) {
        return reservaRepository.save(new Reserva(reservaData));
    }

    public Page<Reserva> getReservas(Pageable pageable){
        return reservaRepository.findAll(pageable).map(reserva -> reserva);
    }
}
