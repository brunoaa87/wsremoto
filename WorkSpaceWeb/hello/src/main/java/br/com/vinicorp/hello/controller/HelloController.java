package br.com.vinicorp.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.vinicorp.hello.model.Produto;
/* Agora a classe aceita atender requisições web no endereço hhtp://localhost:8080 */

@RestController //Digitar esse comando para importar acima
public class HelloController {
	
	@GetMapping("/hello") //esse é o caminho do packege hello para que o método sayHello execute
	public String sayHello() {
		return "Hello Spring Boot!";
	}
	@GetMapping("/hellohtml") //esse é o caminho do packege hello para que o método sayHello execute
	public String sayHtml() {
		return "HTML";
	}		
		
	
	@GetMapping("/produto")
	public Produto exibirProduto() {
		Produto prod = new Produto() ;
			prod.setId(987654);
			prod.setDescricao("Computador Dell");
			prod.setPreco(2500.00);
			prod.setQuantidade(3);
			return prod;		
	}
	
	@PostMapping("/novoproduto")
	public String inserirNovoProduto(@RequestBody Produto novo ) {
		System.out.println("Produto recebido");
		System.out.println(novo.getId() +"/"+ novo.getDescricao() + "/" + novo.getPreco() + "/" + novo.getQuantidade());
		return "Ok";
	}
			

	
}
