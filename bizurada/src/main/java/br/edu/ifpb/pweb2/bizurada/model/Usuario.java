package br.edu.ifpb.pweb2.bizurada.model;
//package br.edu.ifpb.pweb2.biruzada;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Usuario implements Serializable {
    private String id;
	private String nome;


}