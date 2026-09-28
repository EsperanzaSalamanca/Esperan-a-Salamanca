package es.uib.prgava.tema1.ejercicios;

import es.uib.prgava.tema1.poo.RegistroEventos;

/**
 * Ejercicio 1.1.5. Lo mismo que {@link PanelDeEstadoHeredado}, pero por composición.
 *
 * <p>El panel <em>tiene</em> un registro en lugar de <em>ser</em> uno, así que quien decide qué
 * se llama y cuándo eres tú. El modelo es {@code RegistroContador} en su versión con
 * composición.
 */
public final class PanelDeEstado {

    private final RegistroEventos interno = new RegistroEventos();
    private int registrados = 0;

    public void registrar(String evento) {
        // TODO 1.1.5: cuenta y delega en el objeto interno.
        throw new UnsupportedOperationException("TODO 1.1.5: PanelDeEstado.registrar");
    }

    /** Ojo: tiene que llamar a <em>tu</em> registrar, no al del objeto interno. */
    public void registrarVarios(String... eventos) {
        // TODO 1.1.5
        throw new UnsupportedOperationException("TODO 1.1.5: PanelDeEstado.registrarVarios");
    }

    public int registrados() {
        // TODO 1.1.5
        throw new UnsupportedOperationException("TODO 1.1.5: PanelDeEstado.registrados");
    }

    /** Por ejemplo {@code 3 eventos registrados}. */
    public String resumen() {
        // TODO 1.1.5
        throw new UnsupportedOperationException("TODO 1.1.5: PanelDeEstado.resumen");
    }

    // TODO 1.1.5: no añadas métodos que RegistroEventos ofrezca y que el panel no necesite.
    // Lo que no delegues, no existe: esa es la ventaja que se paga con los métodos de arriba.
}
