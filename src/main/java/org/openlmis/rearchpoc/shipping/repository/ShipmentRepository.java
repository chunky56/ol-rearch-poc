package org.openlmis.rearchpoc.shipping.repository;

import org.openlmis.rearchpoc.shipping.domain.Shipment;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ShipmentRepository extends PagingAndSortingRepository<Shipment, Long> {
}