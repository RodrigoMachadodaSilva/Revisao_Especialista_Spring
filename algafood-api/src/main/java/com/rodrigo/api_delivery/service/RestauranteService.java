package com.rodrigo.api_delivery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigo.api_delivery.exception.EntidadeNaoEncontradaException;
import com.rodrigo.api_delivery.model.Cozinha;
import com.rodrigo.api_delivery.model.Restaurante;
import com.rodrigo.api_delivery.repository.CozinhaRepository;
import com.rodrigo.api_delivery.repository.RestauranteRepository;
	
@Service
public class RestauranteService {

		@Autowired
		private RestauranteRepository restauranteRepository;
		
		@Autowired
		private CozinhaRepository cozinhaRepository;
		
		public Restaurante salvar(Restaurante restaurante) {
			Long cozinhaId = restaurante.getCozinha().getId();
			
			Cozinha cozinha = cozinhaRepository.findById(cozinhaId)
				.orElseThrow(() -> new EntidadeNaoEncontradaException(
						String.format("Não existe cadastro de cozinha com código %d", cozinhaId)));
			
			restaurante.setCozinha(cozinha);
			
			return restauranteRepository.save(restaurante);
		}

}
	

