package com.idat.EFMarileslyNavarroMicroservicioClientePrueba.service;

import java.util.List;

import com.idat.EFMarileslyNavarroMicroservicioClientePrueba.model.Cliente;

public interface ClienteService {

	List<Cliente> listar();
	Cliente obtenerId(Integer id);
	void guardar(Cliente cliente);
	void eliminar(Integer id);
	void actualizar(Cliente cliente);
	
	void asignarClientePizza();
	
}
