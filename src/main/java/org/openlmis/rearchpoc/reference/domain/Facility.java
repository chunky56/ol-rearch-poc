package org.openlmis.rearchpoc.reference.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="facilities")
public class Facility {

    private @Id @GeneratedValue Long id;
    private String code;
    private String name;

    private Facility() {}

    public Facility(String code, String name) {
        this.code = code;
        this.name = name;
    }
}
