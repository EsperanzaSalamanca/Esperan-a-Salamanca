package es.uib.prgava.tema1.ejercicios;

import es.uib.prgava.tema1.poo.DispositivoRed;

/**
 * Ejercicio 1.1.4. Punto de acceso inalámbrico: <em>es un</em> dispositivo de red.
 *
 * <p>El modelo son {@code Enrutador} y {@code Conmutador}, en el paquete {@code poo}.
 */
public class PuntoAcceso extends DispositivoRed {

    private final String ssid;
    private int canal;

    /**
     * @param canal de 1 a 13
     * @throws IllegalArgumentException si el canal no está en ese rango
     */
    public PuntoAcceso(String nombre, String direccionIp, String ssid, int canal) {
        super(nombre, direccionIp);
        // TODO 1.1.4: valida el canal y asigna lo propio. La llamada a super(...) ya está
        // escrita y tiene que ser la primera instrucción del constructor.
        throw new UnsupportedOperationException("TODO 1.1.4: constructor de PuntoAcceso");
    }

    public String getSsid() {
        // TODO 1.1.4
        throw new UnsupportedOperationException("TODO 1.1.4: PuntoAcceso.getSsid");
    }

    public int getCanal() {
        // TODO 1.1.4
        throw new UnsupportedOperationException("TODO 1.1.4: PuntoAcceso.getCanal");
    }

    /** Misma validación que el constructor. Piensa si te compensa escribirla dos veces. */
    public void cambiarCanal(int nuevo) {
        // TODO 1.1.4
        throw new UnsupportedOperationException("TODO 1.1.4: PuntoAcceso.cambiarCanal");
    }

    /** Lo heredado y lo propio. Dentro puedes llamar a super.toString(). */
    @Override
    public String toString() {
        // TODO 1.1.4
        throw new UnsupportedOperationException("TODO 1.1.4: PuntoAcceso.toString");
    }

    // TODO 1.1.4: crea un Enrutador y un PuntoAcceso, mira qué devuelve
    // DispositivoRed.getDispositivosCreados() y explica aquí por qué cuenta los dos.
}
