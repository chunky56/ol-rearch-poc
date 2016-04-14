package org.openlmis.rearchpoc.reference.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="supervisory_nodes")
public class SupervisoryNode {

    private @Id @GeneratedValue Long id;
    private String name;
    private String code;
    private String description;
}
