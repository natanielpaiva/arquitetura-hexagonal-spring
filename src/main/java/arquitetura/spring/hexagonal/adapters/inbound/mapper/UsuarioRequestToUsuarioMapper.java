package arquitetura.spring.hexagonal.adapters.inbound.mapper;


import arquitetura.spring.hexagonal.adapters.inbound.request.UsuarioRequest;
import arquitetura.spring.hexagonal.application.core.domain.Usuario;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class UsuarioRequestToUsuarioMapper {

    public  Usuario mapper(UsuarioRequest usuarioRequest){
        var usuario = new Usuario();
        BeanUtils.copyProperties(usuarioRequest, usuario);
        return usuario;
    }

}
