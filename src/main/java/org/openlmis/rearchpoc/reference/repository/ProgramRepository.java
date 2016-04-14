package org.openlmis.rearchpoc.reference.repository;

import org.openlmis.rearchpoc.reference.domain.Program;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProgramRepository extends PagingAndSortingRepository<Program, Long> {
}
