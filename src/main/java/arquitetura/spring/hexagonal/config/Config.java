package arquitetura.spring.hexagonal.config;

import arquitetura.spring.hexagonal.adapters.outbound.BuscarEnderecoAdapter;
import arquitetura.spring.hexagonal.adapters.outbound.SalvarUsuarioAdapter;
import arquitetura.spring.hexagonal.application.core.service.SalvarUsuarioService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
	public SalvarUsuarioService salvarUsuarioService(SalvarUsuarioAdapter salvarUsuarioAdapter, BuscarEnderecoAdapter buscarEnderecoAdapter){
		return new SalvarUsuarioService(salvarUsuarioAdapter, buscarEnderecoAdapter);
	}
}
