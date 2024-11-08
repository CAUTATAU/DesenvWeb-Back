package com.example.Back_end.Web.Entities.Reserva;

import com.example.Back_end.Web.DTOs.ReservaDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Reserva {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Integer ID_reserva;

    Integer ID_cliente;

    Date data;

    StatusReserva status;

    public Reserva(ReservaDTO data) {
        this.ID_cliente = data.ID_cliente();
        this.data = data.data();
        this.status = data.status();
    }
}
