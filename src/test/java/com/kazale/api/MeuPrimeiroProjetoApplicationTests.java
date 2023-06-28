package com.kazale.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
class MeuPrimeiroProjetoApplicationTests {

	@Value("${paginacao.qtd_por_pagina}")
	private int qtdPorPagina;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void testCarregarContextoDeTeste() {
		assertEquals(100, qtdPorPagina);
	}

}