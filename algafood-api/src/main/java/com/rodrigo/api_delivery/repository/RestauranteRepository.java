package com.rodrigo.api_delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.rodrigo.api_delivery.model.Restaurante;

public interface RestauranteRepository extends
JpaRepository<Restaurante, Long> , RestaurateRepositoryCustomized, JpaSpecificationExecutor<Restaurante> {
	

}
