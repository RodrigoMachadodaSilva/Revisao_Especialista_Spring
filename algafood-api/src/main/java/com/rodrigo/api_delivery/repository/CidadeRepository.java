package com.rodrigo.api_delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo.api_delivery.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

}
