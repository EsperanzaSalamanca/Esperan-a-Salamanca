// CopiasEjercicio.java
package es.uib.prgava.tema1.ejercicios;

import java.util.List;

import es.uib.prgava.tema1.monitor.Servicio;

public final class CopiasEjercicio {

    private CopiasEjercicio() { }

    /** Copia al final de `destino` todos los elementos de `origen`. */
    public static void copiarTodo(List<Servicio> origen, List<Servicio> destino) {
        for (Servicio servicio : origen) {
            destino.add(servicio);
        }
    }
}
