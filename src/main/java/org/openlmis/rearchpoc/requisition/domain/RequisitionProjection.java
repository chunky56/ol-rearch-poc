package org.openlmis.rearchpoc.requisition.domain;

import org.openlmis.rearchpoc.reference.domain.Facility;
import org.openlmis.rearchpoc.reference.domain.ProcessingPeriod;
import org.openlmis.rearchpoc.reference.domain.Program;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="filled", types=Requisition.class)
public interface RequisitionProjection {
    Facility getFacility();
    Program getProgram();
    ProcessingPeriod getProcessingPeriod();
}
