package arquitetura.spring.hexagonal.adapters.outbound;

import arquitetura.spring.hexagonal.adapters.outbound.rest.BuscarEnderecoRest;
import arquitetura.spring.hexagonal.application.core.domain.Endereco;
import arquitetura.spring.hexagonal.application.ports.out.BuscarEnderecoPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BuscarEnderecoAdapter implements BuscarEnderecoPort {

    private final BuscarEnderecoRest buscarEnderecoRest;


    @Override
    public Endereco buscar(String cep) {
        var endereco = buscarEnderecoRest.buscar(cep);

        return endereco.getBody();
    }
}
