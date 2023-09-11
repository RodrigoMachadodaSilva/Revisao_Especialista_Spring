package com.rodrigo.api_delivery.repository;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo.api_delivery.model.Restaurante;

public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {

}
