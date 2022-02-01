package arquitetura.spring.hexagonal.adapters.outbound;

import arquitetura.spring.hexagonal.adapters.inbound.mapper.EnderecoToEnderecoEntityMapper;
import arquitetura.spring.hexagonal.adapters.inbound.mapper.UsuarioEntityToUsuarioMapper;
import arquitetura.spring.hexagonal.adapters.inbound.mapper.UsuarioToUsuarioEntityMapper;
import arquitetura.spring.hexagonal.adapters.outbound.repository.UsuarioRepository;
import arquitetura.spring.hexagonal.application.core.domain.Usuario;
import arquitetura.spring.hexagonal.application.ports.out.SalvarUsuarioPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@AllArgsConstructor
public class SalvarUsuarioAdapter implements SalvarUsuarioPort {

    private final UsuarioRepository usuarioRepository;

    private final UsuarioToUsuarioEntityMapper usuarioToUsuarioEntityMapper;

    private final UsuarioEntityToUsuarioMapper usuarioToUsuarioEntitymMapper;

    private final EnderecoToEnderecoEntityMapper enderecoToEnderecoEntityMapper;

    @Override
    @Transactional
    public Usuario salvar(Usuario usuario) {
        var usuarioEntity = usuarioToUsuarioEntityMapper.mapper(usuario);
        var enderecoEntity = enderecoToEnderecoEntityMapper.mapper(usuario.getEndereco());
        usuarioEntity.setEndereco(enderecoEntity);
        return usuarioToUsuarioEntitymMapper.mapper(usuarioRepository.save(usuarioEntity));
    }
}
