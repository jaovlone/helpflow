package br.com.helpflow.domain;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "Chamado")
public class Chamado {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, length = 120)
    private String titulo;

    @Column(nullable = false, unique = true, length = 11)
    private String categoria;

    @Column(nullable = false, unique = true, length = 11)
    private String prioridade;

    @Column(nullable = false, unique = true, length = 11)
    private String solicitante;

    @Column(nullable = false, unique = true, length = 11)
    private String tecnico;

    @Column(nullable = false, unique = true, length = 150)
    private String descricao;

    @Column(length = 11)
    private Boolean status;

    @Column(name = "data_abertura", nullable = false, updatable = false)
    private LocalDateTime dataAbertura;

    @Column(name = "data_fechamento", nullable = false, updatable = false)
    private LocalDateTime dataFechamento;

}