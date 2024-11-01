package com.example.Back_end.Web.Entities.Passeio;


import com.example.Back_end.Web.DTOs.CreatePasseioDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "passeio")
public class Passeio {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Integer id;

    @Column(name = "nome", nullable = false)
    String nome;

    @Column(name="lugar", nullable = false)
    String lugar;

    @Column(name = "descricao", nullable = false)
    String descricao;

    @Column(name="data", nullable = false)
    Date data;

    @Column(name="hora", nullable = false)
    Time hora;

    @Column(name="valor", nullable = false)
    Double valor;

    public Passeio(CreatePasseioDTO data){
        this.nome = data.nome();
        this.descricao = data.descricao();
        this.lugar = data.lugar();
        this.data = data.data();
        this.hora = data.hora();
        this.valor = data.valor();
    }
}
