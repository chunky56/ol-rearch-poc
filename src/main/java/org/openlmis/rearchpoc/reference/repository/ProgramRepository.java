package org.openlmis.rearchpoc.reference.repository;

import org.openlmis.rearchpoc.reference.domain.Program;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProgramRepository extends PagingAndSortingRepository<Program, Long> {

    @Query(value = "SELECT DISTINCT p.*" + 
            " FROM programs p" + 
            " INNER JOIN programs_supported ps ON p.id = ps.programId" + 
            " INNER JOIN role_assignments ra ON ra.programId = p.id" + 
            " INNER JOIN role_rights rr ON rr.roleId = ra.roleId" + 
            " WHERE p.active = TRUE" + 
            " AND ps.active = TRUE" + 
            " AND ra.userId = :userId" + 
            " AND ps.facilityId = :facilityId" + 
            " AND rr.rightName = ANY(('{'||:commaSeparatedRights||'}')\\:\\:VARCHAR[])" +
            " AND ra.supervisoryNodeId IS NULL",
            nativeQuery = true
    )
    List<Program> findByUserHomeFacility(@Param("userId") Long userId,
                                         @Param("facilityId") Long facilityId,
                                         @Param("commaSeparatedRights") String commaSeparatedRights);

    @Query(value = "SELECT DISTINCT p.*" + 
            " FROM programs p" + 
            " INNER JOIN role_assignments ra ON p.id = ra.programId" + 
            " INNER JOIN role_rights rr ON ra.roleId = rr.roleId" + 
            " WHERE p.active = TRUE" + 
            " AND ra.userId = :userId" +
            " AND rr.rightName = ANY(('{'||:commaSeparatedRights||'}')\\:\\:VARCHAR[])" +
            " AND ra.supervisoryNodeId IS NOT NULL",
            nativeQuery = true)
    List<Program> findByUserSupervisedFacilities(@Param("userId") Long userId,
                                                 @Param("commaSeparatedRights") String commaSeparatedRights);
}
