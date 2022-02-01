package arquitetura.spring.hexagonal.adapters.inbound.entity;



import arquitetura.spring.hexagonal.application.core.domain.Endereco;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class EnderecoEntity extends Endereco {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    private Long id;

}
