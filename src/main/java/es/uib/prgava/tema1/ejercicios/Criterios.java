package es.uib.prgava.tema1.ejercicios;

import es.uib.prgava.tema1.monitor.PoliticaDeAlerta;

/**
 * Ejercicio 1.3.4. Políticas de alerta escritas como lambdas.
 *
 * <p>{@code PoliticaDeAlerta} tiene un único método abstracto, así que es una interfaz funcional
 * y se puede implementar sin escribir una clase.
 */
public final class Criterios {

    private Criterios() { }

    /** Alerta siempre, haya lo que haya en el historial. */
    public static final PoliticaDeAlerta SIEMPRE = historial -> {
        // TODO 1.3.4
        throw new UnsupportedOperationException("TODO 1.3.4: Criterios.SIEMPRE");
    };

    /** No alerta nunca. */
    public static final PoliticaDeAlerta NUNCA = historial -> {
        // TODO 1.3.4
        throw new UnsupportedOperationException("TODO 1.3.4: Criterios.NUNCA");
    };

    /** Alerta si el último resultado del historial es un fallo. */
    public static final PoliticaDeAlerta ULTIMO_FALLO = historial -> {
        // TODO 1.3.4
        throw new UnsupportedOperationException("TODO 1.3.4: Criterios.ULTIMO_FALLO");
    };

    /** Devuelve una política que alerta cuando el historial acumula al menos tantos fallos. */
    public static PoliticaDeAlerta alMenos(int fallos) {
        // TODO 1.3.4: devuelve una lambda que capture el parámetro.
        throw new UnsupportedOperationException("TODO 1.3.4: Criterios.alMenos");
    }
}
