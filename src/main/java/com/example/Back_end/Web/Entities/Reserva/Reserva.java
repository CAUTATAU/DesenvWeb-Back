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

    @ManyToOne
    @JoinColumn(name = "ID_Cliente")
    User cliente;

    Date data;
    @Enumerated(EnumType.STRING)
            @Column(name = "status_reserva")
    StatusReserva status;

    public Reserva(ReservaDTO data) {

        this.data = data.data();
        this.status = data.status();
    }
}
