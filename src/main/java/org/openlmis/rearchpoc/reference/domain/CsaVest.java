package org.openlmis.rearchpoc.reference.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="csa_vests")
public class CsaVest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;

    @OneToMany(mappedBy = "csaVest")
    private List<CsaVestAttribute> attributes;
    
    private CsaVest() {}
    
}
