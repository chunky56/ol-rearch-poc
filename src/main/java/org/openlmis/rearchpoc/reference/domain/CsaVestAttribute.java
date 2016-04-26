package org.openlmis.rearchpoc.reference.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="csa_vest_attributes")
public class CsaVestAttribute {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;

    @ManyToOne
    @JoinColumn(name = "csavestid")
    private CsaVest csaVest;

    @ManyToOne
    @JoinColumn(name = "csavestattributetypeid")
    private CsaVestAttributeType type;
    
    private String value;
}
