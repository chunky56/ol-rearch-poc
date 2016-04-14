package org.openlmis.rearchpoc.reference.domain;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="filled", types=Supervision.class)
public interface SupervisionProjection {
    Role getRole();
    Program getProgram();
    SupervisoryNode getSupervisoryNode();
}
