package com.idat.EFMarileslyNavarroMicroservicioClientePrueba.pizz;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.EFMarileslyNavarroMicroservicioClientePrueba.dto.Pizza;

@FeignClient(name="ef-pizza", url="localhost:8090")
public interface OpenFeignPizzaa {

	@GetMapping("/api/pizza/v1/listar")
	public List<Pizza> listarPizzaSeleccionados();
	
}
