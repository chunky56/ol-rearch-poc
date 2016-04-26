package org.openlmis.rearchpoc.reference.domain;

import lombok.Data;
import org.openlmis.rearchpoc.reference.util.ExtraDataConverter;

import javax.persistence.*;

@Data
@Entity
@Table(name="csa_tests")
public class CsaTest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;

    @Column(name="extradata")
    @Convert(converter = ExtraDataConverter.class)
    private Object extraData;

    private CsaTest() {}
    
}
