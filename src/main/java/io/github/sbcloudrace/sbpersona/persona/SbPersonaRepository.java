package io.github.sbcloudrace.sbpersona.persona;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "sbpersonas", collectionResourceRel = "sbpersonas")
public interface SbPersonaRepository extends PagingAndSortingRepository<SbPersona, Long> {

    List<SbPersona> findByUserId(Long userId);
}
