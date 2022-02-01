package arquitetura.spring.hexagonal.adapters.inbound.mapper;


import arquitetura.spring.hexagonal.adapters.inbound.entity.EnderecoEntity;
import arquitetura.spring.hexagonal.application.core.domain.Endereco;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class EnderecoToEnderecoEntityMapper {

    public EnderecoEntity mapper(Endereco endereco){
        var enderecoEntity = new EnderecoEntity();
        BeanUtils.copyProperties(endereco, enderecoEntity);
        return enderecoEntity;
    }

}
