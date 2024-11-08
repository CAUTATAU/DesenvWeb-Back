package com.example.Back_end.Web.Controller;

import com.example.Back_end.Web.DTOs.ReservaDTO;
import com.example.Back_end.Web.Entities.Reserva.Reserva;
import com.example.Back_end.Web.Repositories.UserRepository;
import com.example.Back_end.Web.Services.ReservaService;
import com.example.Back_end.Web.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reserva")
public class ReservaController {

    @Autowired
    ReservaService reservaService;
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;

    @PostMapping()
    public ResponseEntity<String> createReserva(@RequestBody ReservaDTO data) {
        Reserva reserva = new Reserva(data);
        reserva.setCliente(userRepository.findById(data.id_cliente()));
        reservaService.createReserva(reserva);
        return ResponseEntity.ok("Reserva Criada");
    }

    @GetMapping()
    public Page<Reserva> getAllReserva(@PageableDefault(size = 10, sort = {"ID_Cliente"}) Pageable pageable) {
        return reservaService.getReservas(pageable);
    }
}
