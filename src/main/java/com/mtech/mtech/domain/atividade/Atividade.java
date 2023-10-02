package com.mtech.mtech.domain.atividade;


import com.mtech.mtech.domain.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(name = "atividades")
@Table(name = "atividades")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String titulo;
    private String descricao;
    private LocalDateTime data_inicio;
    private LocalDateTime data_fim;
    private LocalDateTime data_atividade;
    private float horas;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private User usuario;

    public Atividade(AtividadeRequestDTO data) {
        this.titulo = data.titulo();
        this.descricao = data.descricao();
        this.data_atividade = data.data_atividade();
        this.data_inicio = data.data_inicio();
        this.data_fim = data.data_fim();
        this.horas = data.horas();
        this.usuario = data.usuario_id();
    }
}
