package org.openlmis.rearchpoc.shipping.domain;

import org.openlmis.rearchpoc.reference.domain.SupplyLineProjection;
import org.openlmis.rearchpoc.requisition.domain.RequisitionProjection;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name="filled", types=Shipment.class)
public interface ShipmentProjection {
    String getStatus();
    String getFtpComment();
    String getOrderNumber();
    RequisitionProjection getRequisition();
    SupplyLineProjection getSupplyLine();
    Date getOrderDate();
}
