package com.mtech.mtech.repositories;

import com.mtech.mtech.domain.atividade.Atividade;
import com.mtech.mtech.domain.atividade.AtividadeResponseDTO;
import com.mtech.mtech.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface AtividadeRepository extends JpaRepository<Atividade, String> {

    List<Atividade> findByUsuarioId(@Param("uuid") String uuid);

}
