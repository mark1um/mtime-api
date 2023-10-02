package com.mtech.mtech.domain.atividade;



import com.mtech.mtech.domain.user.User;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record AtividadeRequestDTO(String titulo, String descricao, LocalDateTime data_inicio, LocalDateTime data_fim,
                                  LocalDateTime data_atividade, float horas, User usuario_id) {
}
