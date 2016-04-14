package org.openlmis.rearchpoc.reference.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="programs")
public class Program {

    private @Id @GeneratedValue Long id;
    private String code;
    private String name;
    private String description;

    private Program() {}

    public Program(String code, String name, String description) {
        this.code = code;
        this.name = name;
        this.description = description;
    }
}
