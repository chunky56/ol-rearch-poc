package org.openlmis.rearchpoc.reference.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="users")
public class User {

    private @Id @GeneratedValue Long id;
    private String username;
    
    @OneToMany(mappedBy="user")
    private List<Supervision> supervisions;
}
