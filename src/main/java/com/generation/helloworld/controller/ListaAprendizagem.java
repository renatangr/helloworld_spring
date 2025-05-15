package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ListaAprendizagem {

	@GetMapping("/listaaprendizagem")
	public String listaAprendizagem() {
		return "<h1>Objetivos de Aprendizagem da Semana</h1>\r\n"
				+ "<ul>\r\n"
				+ "  <li><strong>Introdução ao Spring:</strong> Compreender o que é o Spring Framework e seus benefícios no desenvolvimento Java.</li>\r\n"
				+ "  <li><strong>Spring Core:</strong> Estudar Inversão de Controle (IoC) e Injeção de Dependência (DI).</li>\r\n"
				+ "  <li><strong>Spring Boot:</strong> Aprender a criar aplicações rapidamente com configuração mínima.</li>\r\n"
				+ "  <li><strong>Spring MVC:</strong> Desenvolver aplicações web com arquitetura Model-View-Controller.</li>\r\n"
				+ "  <li><strong>Spring Data JPA:</strong> Integrar bancos de dados com repositórios e consultas simplificadas.</li>\r\n"
				+ "  <li><strong>Spring Security:</strong> Implementar autenticação e autorização em aplicações Java.</li>\r\n"
				+ "  <li><strong>Spring REST:</strong> Criar APIs RESTful com controle de rotas, requisições e respostas.</li>\r\n"
				+ "  <li><strong>Validações:</strong> Aplicar validações com Bean Validation (JSR-380) usando anotações.</li>\r\n"
				+ "  <li><strong>Testes com Spring:</strong> Escrever testes com JUnit, Mockito e suporte do Spring Test.</li>\r\n"
				+ "  <li><strong>Deploy e Monitoramento:</strong> Empacotar aplicações e monitorar performance em produção.</li>\r\n"
				+ "  <li><strong>Boas práticas:</strong> Seguir padrões de projeto, organização de código e princípios SOLID.</li>\r\n"
				+ "</ul>";
	}
}
