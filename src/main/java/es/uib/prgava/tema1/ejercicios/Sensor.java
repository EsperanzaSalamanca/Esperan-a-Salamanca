package es.uib.prgava.tema1.ejercicios;

/**
 * Ejercicio 1.1.6. Lo común a todos los sensores; leer no significa lo mismo en ninguno.
 *
 * <p>El modelo es {@code Figura} con {@code Circulo}, en el paquete {@code poo}.
 */
public abstract class Sensor {

    private final String ubicacion;

    protected Sensor(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String ubicacion() {
        return ubicacion;
    }

    /** Qué mide este sensor ahora mismo. Sin cuerpo: no hay una lectura genérica razonable. */
    public abstract double leer();

    /** Cómo se llama esta magnitud, para el texto de {@link #describir()}. */
    protected abstract String magnitud();

    /**
     * Por ejemplo {@code temperatura en sala-3: 21.5}.
     *
     * <p>Se escribe una sola vez, aquí, y llama a {@link #leer()} aunque leer() no tenga cuerpo
     * en esta clase.
     */
    public String describir() {
        // TODO 1.1.6
        throw new UnsupportedOperationException("TODO 1.1.6: Sensor.describir");
    }
}
