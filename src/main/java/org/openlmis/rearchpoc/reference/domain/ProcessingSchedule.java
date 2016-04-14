package org.openlmis.rearchpoc.reference.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="processing_schedules")
public class ProcessingSchedule {

    private @Id @GeneratedValue Long id;
    private String code;
    private String name;
    private String description;

}
