package arquitetura.spring.hexagonal.adapters.inbound.mapper;

import arquitetura.spring.hexagonal.adapters.inbound.entity.UsuarioEntity;
import arquitetura.spring.hexagonal.application.core.domain.Usuario;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class UsuarioToUsuarioEntityMapper {
     public UsuarioEntity mapper(Usuario usuario){
          var usuarioEntity = new UsuarioEntity();
          BeanUtils.copyProperties(usuario, usuarioEntity);
          return usuarioEntity;
     }

}
