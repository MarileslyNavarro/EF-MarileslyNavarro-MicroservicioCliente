package com.idat.EFMarileslyNavarroMicroservicioClientePrueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EFMarileslyNavarroMicroservicioClientePrueba.dto.Pizza;
import com.idat.EFMarileslyNavarroMicroservicioClientePrueba.model.Cliente;
import com.idat.EFMarileslyNavarroMicroservicioClientePrueba.model.ClientePizza;
import com.idat.EFMarileslyNavarroMicroservicioClientePrueba.model.ClientePizzaFK;
import com.idat.EFMarileslyNavarroMicroservicioClientePrueba.pizz.OpenFeignPizzaa;
import com.idat.EFMarileslyNavarroMicroservicioClientePrueba.repository.ClientePizzaRepository;
import com.idat.EFMarileslyNavarroMicroservicioClientePrueba.repository.ClienteRepository;

@Service
public class ClienteServiceImp implements ClienteService {

	@Autowired
	private ClienteRepository repositoryCiente;
	
	@Autowired
	private ClientePizzaRepository repositoryDetalle;
	
	@Autowired
	private OpenFeignPizzaa feign;
	
	@Override
	public List<Cliente> listar() {
		return repositoryCiente.findAll();
	}

	@Override
	public Cliente obtenerId(Integer id) {
		return repositoryCiente.findById(id).orElse(null);
	}

	@Override
	public void guardar(Cliente cliente) {
		repositoryCiente.save(cliente);
	}

	@Override
	public void eliminar(Integer id) {
		repositoryCiente.deleteById(id);

	}

	@Override
	public void actualizar(Cliente cliente) {
		repositoryCiente.saveAndFlush(cliente);
	}
	
	@Override
	public void asignarClientePizza() {
		
		List<Pizza> listado = feign.listarPizzaSeleccionados();
		ClientePizzaFK fk = null;
		ClientePizza detalle = null;

		
		for (Pizza pizza : listado) {
			
			fk = new ClientePizzaFK();
			fk.setIdPizza(pizza.getIdPizza());
			fk.setIdCliente(1);
			
			detalle = new ClientePizza();
			detalle.setFk(fk);	
			
			repositoryDetalle.save(detalle);
		}
		
	}

}
