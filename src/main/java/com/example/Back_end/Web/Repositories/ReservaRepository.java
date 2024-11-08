package com.example.Back_end.Web.Repositories;

import com.example.Back_end.Web.Entities.Reserva.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {
}
