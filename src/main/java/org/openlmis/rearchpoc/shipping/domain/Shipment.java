package org.openlmis.rearchpoc.shipping.domain;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.openlmis.rearchpoc.reference.domain.SupplyLine;
import org.openlmis.rearchpoc.requisition.domain.Requisition;

import java.util.Date;

@Data
@AllArgsConstructor
@Entity
@Table(name="orders")
public class Shipment {

    private @Id @GeneratedValue Long id;
    private String status;

    @OneToOne
    @JoinColumn(name = "id")
    private Requisition requisition;
    
    @OneToOne
    @JoinColumn(name = "supplylineid")
    private SupplyLine supplyLine;
    
    @Column(name="ftpcomment")
    private String ftpComment;

    @Column(name="ordernumber")
    private String orderNumber;
    
    @Column(name="createddate")
    private Date orderDate;

    private Shipment() {}

}
