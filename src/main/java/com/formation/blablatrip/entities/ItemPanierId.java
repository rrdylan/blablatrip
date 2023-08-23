package com.formation.blablatrip.entities;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class ItemPanierId implements Serializable {
    private Long idPanier;
    private Long idVoyage;
}
