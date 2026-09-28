package es.uib.prgava.tema1.ejercicios;

/** Ejercicio 1.1.6. */
public final class SensorHumedad extends Sensor {

    private final double porcentaje;

    public SensorHumedad(String ubicacion, double porcentaje) {
        super(ubicacion);
        this.porcentaje = porcentaje;
    }

    @Override
    public double leer() {
        // TODO 1.1.6
        throw new UnsupportedOperationException("TODO 1.1.6: SensorHumedad.leer");
    }

    @Override
    protected String magnitud() {
        // TODO 1.1.6: "humedad"
        throw new UnsupportedOperationException("TODO 1.1.6: SensorHumedad.magnitud");
    }
}
