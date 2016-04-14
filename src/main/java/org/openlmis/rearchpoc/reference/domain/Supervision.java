package org.openlmis.rearchpoc.reference.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="role_assignments")
public class Supervision {

    private @Id @GeneratedValue Long id;
    
    @ManyToOne
    @JoinColumn(name="userid")
    private User user;

    @OneToOne
    @JoinColumn(name="roleid")
    private Role role;

    @OneToOne
    @JoinColumn(name="programid")
    private Program program;

    @OneToOne
    @JoinColumn(name="supervisorynodeid")
    private SupervisoryNode supervisoryNode;
}
