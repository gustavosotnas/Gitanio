package br.ufg.inf.repository;

import br.ufg.inf.model.Categoria;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "categoria", path = "categoria")
public interface CategoriaRepository extends PagingAndSortingRepository<Categoria, Long> {
}
