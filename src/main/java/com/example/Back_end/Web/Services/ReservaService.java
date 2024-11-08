package com.example.Back_end.Web.Services;

import com.example.Back_end.Web.DTOs.ReservaDTO;
import com.example.Back_end.Web.Entities.Reserva.Reserva;
import com.example.Back_end.Web.Entities.User.User;
import com.example.Back_end.Web.Repositories.ReservaRepository;
import com.example.Back_end.Web.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReservaService {
    @Autowired
    ReservaRepository reservaRepository;
    @Autowired
    UserRepository userRepository;

    public Reserva createReserva(ReservaDTO reservaData) {
        try {
            Optional<User> cliente = userRepository.findById(reservaData.ID_cliente());
            if(cliente.isEmpty()) {
                throw new RuntimeException("Cliente não encontrado");
            }
            Reserva reserva = new Reserva(reservaData);
            reserva.setCliente(cliente.get());
            return reservaRepository.save(reserva);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao criar reserva");
        }

    }

    public Page<Reserva> getReservas(Pageable pageable){
        return reservaRepository.findAll(pageable).map(reserva -> reserva);
    }
}
