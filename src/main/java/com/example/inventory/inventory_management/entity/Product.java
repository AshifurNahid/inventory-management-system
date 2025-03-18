package com.example.inventory.inventory_management.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "products")
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ctn_no", nullable = false, length = 10)
    private Integer ctnNo;
    @Column(name="aln_no")
    private String alnNo;
    @Column(name="item_name")
    private String itemName;
    @Column(name="than")
    private Integer than;
    @Column(name="meters")
    private Double meters;
    @Column(name="gross_wt")
    private Double grossWt;
    @Column(name="ind_shop")
    private String indShop;
    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @ManyToOne
    @JoinColumn(name = "consignment_id", nullable = false)
    private Consignment consignment;

    @ManyToOne
    @JoinColumn(name = "marka_id", nullable = false)
    private Marka marka;
}
