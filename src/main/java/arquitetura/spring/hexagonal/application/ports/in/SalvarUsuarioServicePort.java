package arquitetura.spring.hexagonal.application.ports.in;


import arquitetura.spring.hexagonal.application.core.domain.Usuario;

public interface SalvarUsuarioServicePort {
    Usuario salvarUsuario(Usuario usuario, String cep);
}
