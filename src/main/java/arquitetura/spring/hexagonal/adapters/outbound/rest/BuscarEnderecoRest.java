package arquitetura.spring.hexagonal.adapters.outbound.rest;

import arquitetura.spring.hexagonal.application.core.domain.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "buscaCep", url = "https://viacep.com.br")
public interface BuscarEnderecoRest {

    @GetMapping( "/ws/{cep}/json")
    ResponseEntity<Endereco> buscar(@PathVariable String cep);

}
