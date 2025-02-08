package com.project.controlaccesoparquemonitores;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ControlAccesoParqueMonitoresApplication {

    // Simulación de un parque de atracciones con monitores
    public static void main(String[] args) {
        Parque parque = new Parque(3); // 3 puertas de acceso
        parque.iniciarSimulacion();
        SpringApplication.run(ControlAccesoParqueMonitoresApplication.class, args);
    }

}
