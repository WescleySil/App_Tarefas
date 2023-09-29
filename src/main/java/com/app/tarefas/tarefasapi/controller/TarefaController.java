package com.app.tarefas.tarefasapi.controller;

import com.app.tarefas.tarefasapi.entity.Tarefa;
import com.app.tarefas.tarefasapi.repository.TarefaRepository;
import com.app.tarefas.tarefasapi.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tarefas")
public class TarefaController {

    @Autowired
    public TarefaService tarefaService = new TarefaService();
    @GetMapping
    public ResponseEntity<List> getTarefa(){
        List<Tarefa> tarefaList= tarefaService.buscarTarefas();
        return ResponseEntity.ok(tarefaList);
    }
}
