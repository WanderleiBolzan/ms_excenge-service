package br.com.wanderlei.repository;

import br.com.wanderlei.model.Exchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeRepository extends JpaRepository<Exchange,Long> {

    Exchange findByFromAndTo(String from, String to) ;

}
