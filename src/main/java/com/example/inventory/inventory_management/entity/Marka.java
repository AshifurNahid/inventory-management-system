package com.example.inventory.inventory_management.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Marka")
public class Marka {
    @Id
    private Long id;
    @Column(unique = true, nullable = false)
    private String marka_name;

}
