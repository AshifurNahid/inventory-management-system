package com.example.inventory.inventory_management.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Marka")
public class Marka {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String marka_name;

}
