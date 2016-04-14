package org.openlmis.rearchpoc.requisition.repository;

import org.openlmis.rearchpoc.requisition.domain.Requisition;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RequisitionRepository extends PagingAndSortingRepository<Requisition, Long> {
}
