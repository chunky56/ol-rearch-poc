package org.openlmis.rearchpoc.reference.domain;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="filled", types=CsaVestAttribute.class)
public interface CsaVestAttributeProjection {
    String getCode();
    CsaVestAttributeType getType();
    String getValue();
}
