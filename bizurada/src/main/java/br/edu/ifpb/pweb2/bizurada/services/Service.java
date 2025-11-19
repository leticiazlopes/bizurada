package br.edu.ifpb.pweb2.bizurada.services;

import java.util.List;

public interface Service<T, ID> {

    public List<T> findAll();

}