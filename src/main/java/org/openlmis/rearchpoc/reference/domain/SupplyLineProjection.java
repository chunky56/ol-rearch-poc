package org.openlmis.rearchpoc.reference.domain;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="filled", types=SupplyLine.class)
public interface SupplyLineProjection {
    Program getProgram();
    Facility getSupplyingFacility();
}
