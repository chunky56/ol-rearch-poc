package org.openlmis.rearchpoc.reference.repository;

import org.openlmis.rearchpoc.reference.domain.Supervision;
import org.openlmis.rearchpoc.reference.domain.SupervisionProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection=SupervisionProjection.class)
public interface SupervisionRepository extends PagingAndSortingRepository<Supervision, Long> {
}
