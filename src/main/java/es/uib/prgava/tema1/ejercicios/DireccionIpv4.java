package es.uib.prgava.tema1.ejercicios;

/**
 * Ejercicios 1.1.1, 1.1.7, 1.1.8 y 1.2.7. Dirección IPv4 como cuatro octetos.
 *
 * <p>Objeto-valor: sin identidad propia e inmutable. Por eso es un {@code record} y por eso no
 * tienes que escribir {@code equals} ni {@code hashCode}.
 */
public record DireccionIpv4(int primero, int segundo, int tercero, int cuarto)
        implements Identificable, Comparable<DireccionIpv4> {

    public DireccionIpv4 {
        // TODO 1.1.1: cada octeto va de 0 a 255. Si alguno se sale, lanza
        // IllegalArgumentException con el mensaje "Octeto fuera de rango: " + valor.
        // Son cuatro comprobaciones iguales: decide si las escribes cuatro veces o
        // extraes un método de clase privado.
    }

    /** Forma habitual de una dirección, por ejemplo {@code 192.168.1.1}. */
    @Override
    public String toString() {
        // TODO 1.1.1: concatena los cuatro componentes separados por puntos.
        throw new UnsupportedOperationException("TODO 1.1.1: DireccionIpv4.toString");
    }

    /**
     * Ejercicio 1.2.7. Fábrica estática: construye la dirección a partir de su forma textual.
     *
     * <p>El modelo es {@code Servicio.desde}. El constructor ya valida el rango, así que no
     * repitas esa comprobación aquí.
     */
    public static DireccionIpv4 desde(String texto) {
        // TODO 1.2.7: parte por los puntos, convierte cada parte y construye el registro.
        // Decide y justifica en un comentario qué pasa si no hay cuatro partes o si una
        // de ellas no es un número.
        throw new UnsupportedOperationException("TODO 1.2.7: DireccionIpv4.desde");
    }

    /** Ejercicio 1.1.7. */
    @Override
    public String identificador() {
        // TODO 1.1.7: la forma con puntos.
        throw new UnsupportedOperationException("TODO 1.1.7: DireccionIpv4.identificador");
    }

    /**
     * Ejercicio 1.1.8. Orden natural: primer octeto, y a igualdad el siguiente.
     *
     * <p>Devuelve negativo, cero o positivo; lo único que se mira es el signo. No restes.
     */
    @Override
    public int compareTo(DireccionIpv4 otra) {
        // TODO 1.1.8
        throw new UnsupportedOperationException("TODO 1.1.8: DireccionIpv4.compareTo");
    }
}
