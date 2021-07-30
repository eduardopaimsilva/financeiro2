package br.com.financeiro.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.financeiro.models.Financeiro;

@RestController
@RequestMapping("/financeiro")
public class FinanceiroController {
	
	@GetMapping
	public List<Financeiro> ola() {
		List<Financeiro> financeiros = new ArrayList<>();
		
		Financeiro financeiro1 = new Financeiro();
		Financeiro financeiro2 = new Financeiro();

		
		financeiro1.setId(1L);
		financeiro1.setNome("eduardo");
		financeiro1.setSobrenome("Paim");
		financeiro1.setCpf("10664724752");
		
		financeiro2.setId(2L);
		financeiro2.setNome("eduardo1");
		financeiro2.setSobrenome("Paim1");
		financeiro2.setCpf("106647247523");
		
		financeiros.add(financeiro1);
		financeiros.add(financeiro2);
		
		return financeiros;
	}
	
	@GetMapping("H")
	public String ola2() {
		return "Hello Word";
	}

}
