package arquitetura.spring.hexagonal.adapters.inbound.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UsuarioRequest {

    private String nome;

    private String instagram;

    private String linkedin;

    private String github;

    private LocalDate dataNascimento;

    private String cep;

}
