package br.com.wanderlei.controller;

import br.com.wanderlei.model.Exchange;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("exchange-service")
public class ExchangeController {

    //http://localhost:8000/echange/5/USD/BRL
    @GetMapping(value="/{amount}/{from}/{to}", produces = MediaType.APPLICATION_JSON_VALUE )
    public Exchange getEchange(
            @PathVariable("amount") BigDecimal amount,
            @PathVariable("from") String from,
            @PathVariable("to") String to){

        return new Exchange ( 1L, from, to, BigDecimal.ONE, BigDecimal.ONE,
                "PORT 8000");
    }

}
