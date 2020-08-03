package com.pr.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "shipment_type_tab")
public class ShipmentType {

    @Id
    @GeneratedValue(generator = "shipment_type_seq_name")
    @SequenceGenerator(name = "shipment_type_seq_name", sequenceName = "shipment_type_seq")
    @Column(name = "shipment_id_col")
    private Integer id;
    @Column(name = "shipment_mode_col", length = 10,nullable = false)
    private String shipmentMode;
    @Column(name = "shipment_code_col",length = 15,nullable = false)
    private String shipmentCode;
    @Column(name = "enable_shipment_col",length = 5, nullable = false)
    private String enableShipment;
    @Column(name = "shipment_grade_col", length = 5,nullable = false)
    private String ShipmentGrade;
    @Column(name = "description_col",length = 200,nullable = false)
    private String description;
}
