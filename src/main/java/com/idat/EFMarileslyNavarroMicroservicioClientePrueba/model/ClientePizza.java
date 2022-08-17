package com.idat.EFMarileslyNavarroMicroservicioClientePrueba.model;

import javax.persistence.Id;




public class ClientePizza {

	@Id
	private ClientePizzaFK fk =new ClientePizzaFK();
	
	public ClientePizzaFK getFk() {
		return fk;
	}

	public void setFk(ClientePizzaFK fk) {
		this.fk = fk;
	}
}
