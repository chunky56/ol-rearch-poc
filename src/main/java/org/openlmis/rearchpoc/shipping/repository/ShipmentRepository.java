package org.openlmis.rearchpoc.shipping.repository;

import org.openlmis.rearchpoc.shipping.domain.Shipment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ShipmentRepository extends PagingAndSortingRepository<Shipment, Long> {

    @Query(value = "SELECT o.*" +
            " FROM orders o" +
            "   INNER JOIN requisitions r ON r.id = o.id" +
            "   INNER JOIN supply_lines s ON o.supplyLineId = s.id" +
            " WHERE r.programId = :programId" +
            "   AND supplyingFacilityId IN (SELECT facilityId" +
            "     FROM fulfillment_role_assignments" +
            "       INNER JOIN role_rights rr ON rr.rightName = 'MANAGE_POD'" +
            "     WHERE userId = :userId" +
            "   GROUP BY facilityId)" +
            "   AND o.status = ANY(('{'||:commaSeparatedStatuses||'}')\\:\\:VARCHAR[])",
            nativeQuery = true
    )
    List<Shipment> findByUserProgramStatus(@Param("userId") Long userId, 
                                           @Param("programId") Long programId, 
                                           @Param("commaSeparatedStatuses") String commaSeparatedStatuses);

    @Query(value = "SELECT o.*" +
            " FROM orders o" +
            "   INNER JOIN requisitions r ON r.id = o.id" +
            "   INNER JOIN supply_lines s ON o.supplyLineId = s.id" +
            " WHERE r.programId = :programId" +
            "   AND r.facilityId = :facilityId" +
            "   AND supplyingFacilityId IN (SELECT facilityId" +
            "     FROM fulfillment_role_assignments" +
            "       INNER JOIN role_rights rr ON rr.rightName = 'MANAGE_POD'" +
            "     WHERE userId = :userId" +
            "   GROUP BY facilityId)" +
            "   AND o.status = ANY(('{'||:commaSeparatedStatuses||'}')\\:\\:VARCHAR[])",
            nativeQuery = true
    )
    List<Shipment> findByUserProgramFacilityStatus(@Param("userId") Long userId, 
                                                   @Param("programId") Long programId, 
                                                   @Param("facilityId") Long facilityId, 
                                                   @Param("commaSeparatedStatuses") String commaSeparatedStatuses);

}