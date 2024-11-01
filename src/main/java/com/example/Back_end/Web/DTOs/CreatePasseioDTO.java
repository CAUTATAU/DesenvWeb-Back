package com.example.Back_end.Web.DTOs;

import java.sql.Time;
import java.util.Date;

public record CreatePasseioDTO(
        String nome,
        String lugar,
        String descricao,
        Date data,
        Time hora,
        Double valor
) {
}
