package com.formation.blablatrip;

import com.formation.blablatrip.entities.DestinationEntity;
import com.formation.blablatrip.services.DestinationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j // log lombok
public class BlablatripApplication {

    @Autowired
    private DestinationService destinationService;

    public static void main(String[] args) {
        SpringApplication.run(BlablatripApplication.class, args);
        log.info("Hola");

    }
/*
    @Bean // Test à lancer au démarrage
    public void testDestinationService() {
        DestinationEntity destination = new DestinationEntity();

        destination.setNom("Lune de miel");
        destination.setPays("France");
        destination.setVille("Bora Bora");
        destination.setPrixBase(1253.85);
		destination.setDescription("On à la clim");

        try {
            destinationService.save(destination);
            log.info("Liste des destination : {}", destinationService.findAll());
        } catch (Exception e) {
            log.error("Destination service : {}", e.getMessage());
        }

    }
*/
}
