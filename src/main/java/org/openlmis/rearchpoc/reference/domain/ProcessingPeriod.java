package org.openlmis.rearchpoc.reference.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="processing_periods")
public class ProcessingPeriod {

    private @Id @GeneratedValue Long id;
    private String name;
    private String description;
    
    @ManyToOne
    @JoinColumn(name = "scheduleid")
    private ProcessingSchedule processingSchedule;

    @Column(name="startdate")
    private Date startDate;

    @Column(name="enddate")
    private Date endDate;
}
