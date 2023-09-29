package com.app.tarefas.tarefasapi.entity;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aspectj.lang.annotation.After;

import java.text.SimpleDateFormat;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tarefas")
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Nonnull
    private String titulo;

    @Nonnull
    private String descricao;

    @Nonnull
    private boolean estaConcluido;

    @Temporal(TemporalType.TIMESTAMP)
    private Date criadoEm = new Date();
}
