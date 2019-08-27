package br.com.cesed.facisa.si.arq.Atvd1.repositories;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.cesed.facisa.si.arq.Atvd1.domain.Usuario;


@RepositoryRestResource(collectionResourceRel = "Usuario", path = "usuario")
public interface UsuarioRepository extends PagingAndSortingRepository<Usuario, Integer> {
	List<Usuario> findByLastName(@Param("usuario") String name);

}
