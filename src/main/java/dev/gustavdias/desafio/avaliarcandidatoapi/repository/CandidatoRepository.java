package dev.gustavdias.desafio.avaliarcandidatoapi.repository;

import dev.gustavdias.desafio.avaliarcandidatoapi.model.Candidato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidatoRepository extends JpaRepository<Candidato, Long> {
}
