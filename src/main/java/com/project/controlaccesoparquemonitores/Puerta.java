package com.project.controlaccesoparquemonitores;

public class Puerta {
    private final int id;
    private boolean ocupada = false;

    public Puerta(int id) {
        this.id = id;
    }

    // Método que simula el acceso a través de la puerta
    public synchronized boolean acceder(Visitante visitante) {
        // Comprobar si la puerta está ocupada
        while (ocupada) {
            try {
                wait(); // Esperar si la puerta está ocupada
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        ocupada = true; // Marcar la puerta como ocupada con un flag booleano.
        System.out.println("Visitante " + visitante.getId() + " accediendo a través de la puerta " + id);

        //Comprobación con try catch de tiempo de acceso
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Visitante " + visitante.getId() + " ha accedido a la puerta " + id);
        ocupada = false; // Liberar la puerta
        notify(); // Notificar a otros hilos que la puerta está libre
        return true;
    }
}
