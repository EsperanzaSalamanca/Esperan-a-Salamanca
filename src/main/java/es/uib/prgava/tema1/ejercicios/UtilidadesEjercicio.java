package es.uib.prgava.tema1.ejercicios;

/** Ejercicio 1.3.2. Dos métodos genéricos, uno con cota y otro sin ella. */
public final class UtilidadesEjercicio {

    private UtilidadesEjercicio() { }

    /** El mayor de los dos según su orden natural. La cota es lo que permite usar compareTo. */
    public static <T extends Comparable<T>> T mayor(T a, T b) {
        // TODO 1.3.2
        throw new UnsupportedOperationException("TODO 1.3.2: UtilidadesEjercicio.mayor");
    }

    /** Cuántos elementos del array son iguales a {@code buscado}, según equals. */
    public static <T> int contarIguales(T[] elementos, T buscado) {
        // TODO 1.3.2
        throw new UnsupportedOperationException("TODO 1.3.2: UtilidadesEjercicio.contarIguales");
    }
}
