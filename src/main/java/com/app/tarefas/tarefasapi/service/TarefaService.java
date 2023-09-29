package com.app.tarefas.tarefasapi.service;

import com.app.tarefas.tarefasapi.entity.Tarefa;
import com.app.tarefas.tarefasapi.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;
    public List<Tarefa> buscarTarefas(){
        return tarefaRepository.findAll();
    }
}
