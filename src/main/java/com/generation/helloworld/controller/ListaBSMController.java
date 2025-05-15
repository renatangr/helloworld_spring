package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/listabsm")
public class ListaBSMController {

	@GetMapping
	public String listabsm() {
		return "<h1>Competências Comportamentais (Soft Skills)</h1>\r\n"
				+ "  <ul>\r\n"
				+ "    <li><strong>Liderança:</strong> Capacidade de influenciar, motivar e guiar pessoas para alcançar objetivos.</li>\r\n"
				+ "    <li><strong>Trabalho em Equipa:</strong> Colaborar eficazmente com outros para atingir metas comuns.</li>\r\n"
				+ "    <li><strong>Comunicação:</strong> Expressar ideias de forma clara e eficaz, tanto verbalmente como por escrito.</li>\r\n"
				+ "    <li><strong>Adaptabilidade:</strong> A capacidade de se ajustar a mudanças e a novas situações.</li>\r\n"
				+ "    <li><strong>Resolução de Problemas:</strong> Identificar e solucionar desafios de forma criativa e eficaz.</li>\r\n"
				+ "    <li><strong>Pensamento Crítico:</strong> Avaliar informações de forma objetiva e tomar decisões informadas.</li>\r\n"
				+ "    <li><strong>Criatividade:</strong> Pensar de forma inovadora e gerar novas ideias.</li>\r\n"
				+ "    <li><strong>Inteligência Emocional:</strong> Reconhecer e gerir as próprias emoções e as dos outros.</li>\r\n"
				+ "    <li><strong>Empatia:</strong> Compreender e compartilhar os sentimentos dos outros.</li>\r\n"
				+ "    <li><strong>Aprendizagem Contínua:</strong> Buscar constantemente novos conhecimentos e habilidades.</li>\r\n"
				+ "    <li><strong>Ética:</strong> Agir com integridade e responsabilidade.</li>\r\n"
				+ "  </ul>";
	}
}
