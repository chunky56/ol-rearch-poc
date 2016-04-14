package org.openlmis.rearchpoc.reference.repository;

import org.openlmis.rearchpoc.reference.domain.SupplyLine;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SupplyLineRepository extends PagingAndSortingRepository<SupplyLine, Long> {
}
