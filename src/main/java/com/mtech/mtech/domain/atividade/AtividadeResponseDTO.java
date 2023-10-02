package com.mtech.mtech.domain.atividade;

import java.time.LocalDateTime;

public record AtividadeResponseDTO(String id, String titulo, String descricao, LocalDateTime data_atividade, Float horas) {
    public AtividadeResponseDTO(Atividade atividade){
        this(atividade.getId(), atividade.getTitulo(), atividade.getDescricao(), atividade.getData_atividade(), atividade.getHoras());
    }
}
