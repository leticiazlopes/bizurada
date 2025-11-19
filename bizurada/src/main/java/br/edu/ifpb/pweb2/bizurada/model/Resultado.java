package br.edu.ifpb.pweb2.bizurada.model;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Resultado implements Serializable {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "participante_id")
    private Usuario participante;

    private Integer pontuacao;
        
    @ManyToOne
    @JoinColumn(name = "corrida_id")
    private Corrida corrida;
    
    @Temporal(TemporalType.DATE)
    private Date dataHora;
    
  }