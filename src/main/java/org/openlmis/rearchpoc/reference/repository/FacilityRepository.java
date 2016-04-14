package org.openlmis.rearchpoc.reference.repository;

import org.openlmis.rearchpoc.reference.domain.Facility;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface FacilityRepository extends PagingAndSortingRepository<Facility, Long> {
}
