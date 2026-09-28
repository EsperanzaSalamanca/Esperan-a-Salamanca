package es.uib.prgava.tema1.ejercicios;

import java.util.List;

/**
 * Ejercicio 1.3.1. Almacén de los últimos {@code capacidad} elementos, de cualquier tipo.
 *
 * <p>El parámetro de tipo se declara una vez, aquí, y a partir de ahí {@code T} es un tipo más.
 */
public final class Historial<T> {

    private final int capacidad;

    public Historial(int capacidad) {
        // TODO 1.3.1: valida la capacidad y prepara el almacén.
        throw new UnsupportedOperationException("TODO 1.3.1: constructor de Historial");
    }

    /** Al superar la capacidad se descarta el más antiguo. */
    public void anadir(T elemento) {
        // TODO 1.3.1
        throw new UnsupportedOperationException("TODO 1.3.1: Historial.anadir");
    }

    /** Los {@code cuantos} más recientes, del más antiguo al más nuevo, en lista inmutable. */
    public List<T> ultimos(int cuantos) {
        // TODO 1.3.1
        throw new UnsupportedOperationException("TODO 1.3.1: Historial.ultimos");
    }

    public int tamano() {
        // TODO 1.3.1
        throw new UnsupportedOperationException("TODO 1.3.1: Historial.tamano");
    }
}
