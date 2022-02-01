package arquitetura.spring.hexagonal.adapters.inbound.mapper;

import arquitetura.spring.hexagonal.adapters.inbound.entity.UsuarioEntity;
import arquitetura.spring.hexagonal.application.core.domain.Usuario;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class UsuarioEntityToUsuarioMapper {

     public Usuario mapper(UsuarioEntity usuarioEntity){
          var usuario = new Usuario();
          BeanUtils.copyProperties(usuarioEntity, usuario);
          return usuario;
     }

}
