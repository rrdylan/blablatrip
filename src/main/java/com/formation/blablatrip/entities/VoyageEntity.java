package com.formation.blablatrip.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Collection;

@Data
@Entity
@Table(name = "voyage")
public class VoyageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime dateDepart;

    @Column(nullable = false)
    private LocalDateTime dateRetour;

    @Column(nullable = false)
    private Double prix;

    @Column(nullable = false)
    private Integer placesDisponible;

    @OneToMany(mappedBy = "voyage")
    private Collection<AvisEntity> avisList;

    @OneToMany(mappedBy = "voyage")
    private Collection<ReservationEntity> reservationList;

    @OneToMany(mappedBy = "voyage")
    private Collection<ItemPanierEntity> panierList;

    @ManyToOne(optional = false)
    private DestinationEntity destination;



}
