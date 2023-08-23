package com.formation.blablatrip.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;

@Data
@Entity
@Table(name="destination")
public class DestinationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 100)
    private String nom;
    @Column(nullable = false, columnDefinition = "LONGTEXT")
    private String description;
    @Column(nullable = false, length = 100)
    private String pays;
    @Column(nullable = false, length = 100)
    private String ville;

    private Double prixBase;

    @OneToMany(mappedBy="destination")
    private Collection<VoyageEntity> voyages;
}
