package br.edu.ifpb.pweb2.bizurada.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifpb.pweb2.bizurada.model.Corrida;

public interface CorridaRepository extends JpaRepository<Corrida, Integer> {
    Corrida findById(int id_corrida);
}