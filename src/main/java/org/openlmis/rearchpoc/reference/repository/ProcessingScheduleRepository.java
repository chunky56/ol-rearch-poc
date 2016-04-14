package org.openlmis.rearchpoc.reference.repository;

import org.openlmis.rearchpoc.reference.domain.ProcessingSchedule;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProcessingScheduleRepository extends PagingAndSortingRepository<ProcessingSchedule, Long> {
}
