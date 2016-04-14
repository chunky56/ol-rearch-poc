package org.openlmis.rearchpoc.requisition.domain;

import lombok.Data;
import org.openlmis.rearchpoc.reference.domain.Facility;
import org.openlmis.rearchpoc.reference.domain.ProcessingPeriod;
import org.openlmis.rearchpoc.reference.domain.Program;

import javax.persistence.*;

@Data
@Entity
@Table(name="requisitions")
public class Requisition {

    private @Id @GeneratedValue Long id;

    @ManyToOne
    @JoinColumn(name="facilityid")
    private Facility facility;

    @ManyToOne
    @JoinColumn(name="programid")
    private Program program;

    @ManyToOne
    @JoinColumn(name="periodid")
    private ProcessingPeriod processingPeriod;
    
    private String status;
}
