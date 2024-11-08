package com.example.Back_end.Web.Entities.Reserva;

import com.example.Back_end.Web.DTOs.ReservaDTO;
import com.example.Back_end.Web.Entities.User.User;
import jakarta.persistence.*;
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

    Integer id_cliente;

    @ManyToOne@JoinColumn(name = "ID_Cliente")
    User cliente;

    Date data;

    @Enumerated(EnumType.STRING)
    StatusReserva status;

    public Reserva(ReservaDTO data) {
        this.id_cliente = data.id_cliente();
        this.data = data.data();
        this.status = data.status();
    }
}
