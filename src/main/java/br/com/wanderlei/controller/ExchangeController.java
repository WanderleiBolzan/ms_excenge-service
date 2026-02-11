package br.com.wanderlei.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller responsável pelas operações de câmbio (Exchange).
 * Corrigido para incluir os imports de log e nomenclatura de classe.
 */
@RestController
@RequestMapping("exchange-service")
public class ExchangeController {

    // Inicialização do Logger corrigida (garantindo o nome correto da classe)
    private static final Logger logger = LoggerFactory.getLogger(ExchangeController.class);

    /**
     * Exemplo de endpoint para conversão de moeda.
     * Substitua o retorno pela sua lógica de negócio ou DTO.
     */
    @GetMapping(value = "/{amount}/{from}/{to}")
    public String getExchange(
            @PathVariable("amount") Double amount,
            @PathVariable("from") String from,
            @PathVariable("to") String to
    ) {
        
        // Exemplo de uso do log que causava o erro anteriormente
        logger.info("getExchange chamado com: {} de {} para {}", amount, from, to);
        
        // Lógica de exemplo (deve ser substituída pela sua regra de negócio)
        return String.format("Valor: %.2f | De: %s | Para: %s", amount, from, to);
    }
}