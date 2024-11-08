package com.example.Back_end.Web.DTOs;

import com.example.Back_end.Web.Entities.Reserva.StatusReserva;

import java.util.Date;

public record ReservaDTO(
        Integer ID_cliente,
        Date data,
        StatusReserva status
) {}
