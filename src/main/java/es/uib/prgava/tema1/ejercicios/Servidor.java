package es.uib.prgava.tema1.ejercicios;

/**
 * Ejercicios 1.1.2 y 1.1.7. Servidor: objeto con identidad y con estado que cambia.
 *
 * <p>Clase tradicional, no un {@code record}, precisamente porque su estado cambia. El modelo
 * es {@code DispositivoRed}. Fíjate en que no hay ni debe haber un método para cambiar el
 * nombre.
 */
public class Servidor implements Identificable {

    // TODO 1.1.2: declara aquí el atributo de clase que cuenta los servidores creados.

    private final String nombre;
    private boolean enMantenimiento;

    /**
     * Un servidor nace fuera de mantenimiento.
     *
     * @throws IllegalArgumentException si el nombre es {@code null} o está en blanco
     */
    public Servidor(String nombre) {
        // TODO 1.1.2: valida el nombre, inicializa el estado e incrementa el contador.
        throw new UnsupportedOperationException("TODO 1.1.2: constructor de Servidor");
    }

    /** Método de clase: cuántos servidores se han construido desde que arrancó el programa. */
    public static int servidoresCreados() {
        // TODO 1.1.2
        throw new UnsupportedOperationException("TODO 1.1.2: Servidor.servidoresCreados");
    }

    public void entrarEnMantenimiento() {
        // TODO 1.1.2
        throw new UnsupportedOperationException("TODO 1.1.2: Servidor.entrarEnMantenimiento");
    }

    public void salirDeMantenimiento() {
        // TODO 1.1.2
        throw new UnsupportedOperationException("TODO 1.1.2: Servidor.salirDeMantenimiento");
    }

    public String nombre() {
        // TODO 1.1.2
        throw new UnsupportedOperationException("TODO 1.1.2: Servidor.nombre");
    }

    public boolean estaEnMantenimiento() {
        // TODO 1.1.2
        throw new UnsupportedOperationException("TODO 1.1.2: Servidor.estaEnMantenimiento");
    }

    /** Por ejemplo {@code web01 (operativo)} o {@code web01 (en mantenimiento)}. */
    @Override
    public String toString() {
        // TODO 1.1.2
        throw new UnsupportedOperationException("TODO 1.1.2: Servidor.toString");
    }

    /** Ejercicio 1.1.7. */
    @Override
    public String identificador() {
        // TODO 1.1.7: el nombre del servidor.
        throw new UnsupportedOperationException("TODO 1.1.7: Servidor.identificador");
    }
}
