package com.project.controlaccesoparquemonitores;

public class Visitante {
    private final int id;
    private final int codigoAcceso;

    // Constructor de la clase visitante
    public Visitante(int id, int codigoAcceso) {
        this.id = id;
        this.codigoAcceso = codigoAcceso;
    }

    public int getId() {
        return id;
    }

    public int getCodigoAcceso() {
        return codigoAcceso;
    }
}

