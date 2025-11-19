package br.edu.ifpb.pweb2.bizurada.model;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Corrida implements Serializable {
    private String id;
	private String titulo;
	private String Descricao;
	private Number tempoSegundos;
	private Boolean ativa;
}

    

