package es.uib.prgava.tema1.ejercicios;

/**
 * Ejercicio 1.1.7. Cualquier cosa que sepa decir cómo se llama a sí misma.
 *
 * <p>Una interfaz no exige parentesco: la implementan {@link Servidor} y {@link DireccionIpv4},
 * que no tienen nada en común. El modelo es {@code Describible}, en el tema.
 */
public interface Identificable {

    /** Cómo se identifica este objeto. Cada clase decide qué devuelve. */
    String identificador();

    /**
     * Comportamiento derivado del método abstracto: {@code "[" + identificador() + "]"}.
     *
     * <p>Quien implemente la interfaz lo recibe sin escribirlo.
     */
    default String etiqueta() {
        // TODO 1.1.7
        throw new UnsupportedOperationException("TODO 1.1.7: Identificable.etiqueta");
    }
}
