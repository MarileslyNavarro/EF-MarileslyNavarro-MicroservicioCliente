package com.idat.EFMarileslyNavarroMicroservicioClientePrueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EFMarileslyNavarroMicroservicioClientePrueba.model.ClientePizza;

@Repository
public interface ClientePizzaRepository extends JpaRepository<ClientePizza, Integer> {

}
