package org.openlmis.rearchpoc.reference.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="supply_lines")
public class SupplyLine {

    private @Id @GeneratedValue Long id;

    @ManyToOne
    @JoinColumn(name="programid")
    private Program program;

    @ManyToOne
    @JoinColumn(name="supplyingfacilityid")
    private Facility supplyingFacility;
}
