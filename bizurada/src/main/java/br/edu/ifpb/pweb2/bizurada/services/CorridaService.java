package br.edu.ifpb.pweb2.bizurada.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.edu.ifpb.pweb2.bizurada.model.Corrida;
import br.edu.ifpb.pweb2.bizurada.repository.CorridaRepository;


@Component
public class CorridaService implements Service<Corrida, Integer>{

    @Autowired
    private CorridaRepository corridaRepository;

    @Override
    public List<Corrida> findAll() {
        return corridaRepository.findAll();
    }
}