package com.itb.inf2bm.comercio.controller; 

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/comercio/produtos")
public class LojaController {

	@GetMapping("/listar")
	public String listarProdutos() {
		
		List<Produto> listadeProduto = new ArrayList<Produto>();
		
		Produto p1 = new Produto()/
				
		pi.setId(201);
		p1.setNome("Maquina de Lavar Brastemp");
		pi.setPreco(2654.65);
		pi.setCodigoDeBarras("JFDJAIOJEOHSOA12365415");
		pi.setDescricao("Máquina de Lavar Brastemp 131 com painel digital");
		
		//Adicionando o produto no array
		
		listaDeProdutos.add(pi);
		
		
		return "produtos"; //retorna o template
	}
}
