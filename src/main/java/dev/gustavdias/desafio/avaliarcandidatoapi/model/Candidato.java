package dev.gustavdias.desafio.avaliarcandidatoapi.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@ToString
@Entity(name = "Candidato")
@Table(name = "Candidato")
public class Candidato implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;
    @Column
    private Integer idade;
    @Column
    private String vaga;
    @Column
    private Integer softSkills;
    @Column
    private Integer hardSkills;
    @Column
    private Integer pontuacaoDesafio;
    @Column
    private String status;

    public Candidato() {
    }

    public Candidato(String nome, Integer idade, String vaga, Integer softSkills, Integer hardSkills, Integer pontuacaoDesafio, String status) {
        this.nome = nome;
        this.idade = idade;
        this.vaga = vaga;
        this.softSkills = softSkills;
        this.hardSkills = hardSkills;
        this.pontuacaoDesafio = pontuacaoDesafio;
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Candidato candidato = (Candidato) o;
        return id != null && Objects.equals(id, candidato.id);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
