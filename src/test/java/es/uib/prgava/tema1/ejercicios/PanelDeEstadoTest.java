package es.uib.prgava.tema1.ejercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Ejercicio 1.1.5. Las dos versiones cuentan bien hoy; la diferencia está en quién controla
 * qué se llama. Lee {@link PanelDeEstadoHeredado} y pregúntate qué pasaría si
 * {@code RegistroEventos.registrarVarios} dejara de llamar a {@code registrar}.
 */
class PanelDeEstadoTest {

    @Test
    void cuentaLosEventosRegistradosDeUnoEnUno() {
        var panel = new PanelDeEstado();
        panel.registrar("enlace caído");
        panel.registrar("enlace restaurado");
        assertEquals(2, panel.registrados());
    }

    @Test
    void cuentaLosEventosRegistradosEnGrupo() {
        var panel = new PanelDeEstado();
        panel.registrarVarios("uno", "dos", "tres");
        assertEquals(3, panel.registrados());
        assertEquals("3 eventos registrados", panel.resumen());
    }

    @Test
    void losDosCaminosSeSuman() {
        var panel = new PanelDeEstado();
        panel.registrar("uno");
        panel.registrarVarios("dos", "tres");
        assertEquals(3, panel.registrados());
    }

    @Test
    void laVersionHeredadaTambienCuentaBienDeMomento() {
        var heredado = new PanelDeEstadoHeredado();
        heredado.registrarVarios("uno", "dos", "tres");
        assertEquals(3, heredado.registrados());
    }
}
