package dev.gustavdias.desafio.avaliarcandidatoapi.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity(name = "TB_Tarefa")
@Table(name = "TB_Tarefa")
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
