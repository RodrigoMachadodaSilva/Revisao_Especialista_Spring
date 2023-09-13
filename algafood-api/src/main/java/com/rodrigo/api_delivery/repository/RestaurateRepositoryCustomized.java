package com.rodrigo.api_delivery.repository;

import java.math.BigDecimal;
import java.util.List;

import com.rodrigo.api_delivery.model.Restaurante;

public interface RestaurateRepositoryCustomized {

	List<Restaurante> find(String nome, BigDecimal taxaFreteInicial, BigDecimal taxaFreteFinal);

}