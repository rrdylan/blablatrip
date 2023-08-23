package com.formation.blablatrip.entities;


import com.formation.blablatrip.Enums.ReservationStatutEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Collection;

@Data
@Entity
@Table(name = "reservation")
public class ReservationEntity {
    @EmbeddedId
    private ReservationId id;

    @ManyToOne
    @MapsId("idUtilisateur")
    @JoinColumn(name = "id_utilisateur")
    private UtilisateurEntity utilisateur;

    @ManyToOne
    @MapsId("idVoyage")
    @JoinColumn(name = "id_voyage")
    private VoyageEntity voyage;

    @Column
    private LocalDateTime dateReservation;

    @Column
    private Integer nbPersonne;

    @Column
    private Double prixTotal;

    @Enumerated(EnumType.STRING)
    private ReservationStatutEnum statut;

}
