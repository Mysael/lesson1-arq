package br.com.cesed.facisa.si.arq.Atvd1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.cesed.facisa.si.arq.Atvd1.repositories.ContaRepository;
import br.com.cesed.facisa.si.arq.Atvd1.repositories.UsuarioRepository;

@SpringBootApplication
public class Atvd1Application {
	@Autowired
	private ContaRepository contaRepository;
	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(Atvd1Application.class, args);
		
		
	}

}
