package com.mtech.mtech.controllers;


import com.mtech.mtech.domain.atividade.Atividade;
import com.mtech.mtech.domain.atividade.AtividadeRequestDTO;
import com.mtech.mtech.domain.atividade.AtividadeResponseDTO;
import com.mtech.mtech.repositories.AtividadeRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("atividade")
public class AtividadeController {

    @Autowired
    AtividadeRepository repository;

    @PostMapping
    public void saveAtividade(@RequestBody @Valid AtividadeRequestDTO data){
        Atividade atividadeData = new Atividade(data);
        repository.save(atividadeData);
        return;
    }

    @GetMapping
    public List<AtividadeResponseDTO> getAll(){
        List<AtividadeResponseDTO> atividadeList = repository.findAll().stream().map(AtividadeResponseDTO::new).toList();
        return atividadeList;
    }

    @GetMapping("/{uuid}")
    public  List<AtividadeResponseDTO> getByUsuario_id(@PathVariable String uuid){
        List<AtividadeResponseDTO> atividadeList = repository.findByUsuarioId(uuid).stream().map(AtividadeResponseDTO::new).toList();
        return atividadeList;
    }

    @DeleteMapping("/{uuid}")
    public ResponseEntity deleteAtividade(@PathVariable String uuid){
        Optional<Atividade> atividade = repository.findById(uuid);
        if(atividade.isPresent()){
            repository.deleteById(uuid);
            return ResponseEntity.ok("Excluido com Sucesso");
        }else{
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não encontrado");
        }
    }
}
