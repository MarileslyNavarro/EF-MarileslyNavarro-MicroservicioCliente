package com.idat.EFMarileslyNavarroMicroservicioClientePrueba.model;

import java.io.Serializable;

import javax.persistence.Column;

import lombok.Data;

@Data
public class ClientePizzaFK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -755853619062025996L;

	@Column(name="id_cliente", nullable = false, unique = true)
	private Integer idCliente;
	
	@Column(name="id_pizza", nullable = false, unique = true)
	private Integer idPizza;
	
}
