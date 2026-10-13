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
@Table(name = "comentario")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, length = 120)
    private String mensagem;

    @Column(nullable = false, length = 120)
    private String autor;

    @Column(name = "data_comentario", nullable = false, updatable = false)
    private LocalDateTime dataComentario;

    @Column(nullable = false, unique = true, length = 150)
    private String chamado;
}

