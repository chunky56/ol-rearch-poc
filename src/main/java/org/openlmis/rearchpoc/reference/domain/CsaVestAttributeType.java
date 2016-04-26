package org.openlmis.rearchpoc.reference.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="csa_vest_attribute_types")
public class CsaVestAttributeType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String description;
    private String format;
}
