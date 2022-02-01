package arquitetura.spring.hexagonal.adapters.outbound.repository;

import arquitetura.spring.hexagonal.adapters.inbound.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
}
