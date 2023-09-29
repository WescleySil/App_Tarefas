package com.app.tarefas.tarefasapi.repository;

import com.app.tarefas.tarefasapi.entity.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

}
