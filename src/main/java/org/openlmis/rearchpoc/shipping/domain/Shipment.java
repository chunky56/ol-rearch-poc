package org.openlmis.rearchpoc.shipping.domain;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name="orders")
public class Shipment {

    private @Id @GeneratedValue Long id;
    private String status;
    
    @Column(name="ftpcomment")
    private String ftpComment;

    @Column(name="ordernumber")
    private String orderNumber;

    private Shipment() {}

    public Shipment(String status, String ftpComment, String orderNumber) {
        this.status = status;
        this.ftpComment = ftpComment;
        this.orderNumber = orderNumber;
    }
}
