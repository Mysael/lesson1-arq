package br.com.cesed.facisa.si.arq.Atvd1.repositories;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.cesed.facisa.si.arq.Atvd1.domain.Conta;


@RepositoryRestResource(collectionResourceRel = "conta", path = "conta")
public interface ContaRepository extends PagingAndSortingRepository<Conta, Integer> {
	List<Conta> findByLastName(@Param("conta") String name);

}
