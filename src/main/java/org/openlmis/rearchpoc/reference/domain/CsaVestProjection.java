package org.openlmis.rearchpoc.reference.domain;

import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name="filled", types=CsaVest.class)
public interface CsaVestProjection {
    String getCode();
    List<CsaVestAttributeProjection> getAttributes();
}
