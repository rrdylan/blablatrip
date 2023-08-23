package com.formation.blablatrip.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Collection;

@Data
@Entity
@Table(name = "itemPanier")
public class ItemPanierEntity {
    @EmbeddedId
    private ItemPanierId id;

    @ManyToOne
    @MapsId("idPanier")
    @JoinColumn(name = "id_panier")
    private PanierEntity panier;

    @ManyToOne
    @MapsId("idVoyage")
    @JoinColumn(name = "id_voyage")
    private VoyageEntity voyage;

    @Column(nullable = false, columnDefinition = "SMALLINT DEFAULT 1")
    private Integer quantite;

    @Column
    private Double sousTotal;

    @Column
    private LocalDateTime dateAjout;



}
