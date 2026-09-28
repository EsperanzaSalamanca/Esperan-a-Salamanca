package es.uib.prgava.tema1.ejercicios;

import java.util.List;

import org.junit.jupiter.api.Test;

import es.uib.prgava.tema1.monitor.Estado;
import es.uib.prgava.tema1.monitor.Resultado;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/** Ejercicios 1.3.5 y 1.3.6. */
class InformesEjercicioTest {

    private static final List<Resultado> HISTORIAL = Datos.historialMezclado();

    @Test
    void cuentaLosFallos() {
        assertEquals(2, InformesEjercicio.fallos(HISTORIAL));
        assertEquals(0, InformesEjercicio.fallos(List.of()));
    }

    @Test
    void calculaLaLatenciaMedia() {
        // 100 + 0 + 700 + 40 + 0 = 840 entre 5
        assertEquals(168.0, InformesEjercicio.latenciaMediaEnMilisegundos(HISTORIAL), 0.001);
    }

    @Test
    void conHistorialVacioLaMediaNoRevienta() {
        assertEquals(0.0, InformesEjercicio.latenciaMediaEnMilisegundos(List.of()), 0.001);
    }

    @Test
    void listaLosServiciosConAlgunFalloSinRepetir() {
        var conFallo = InformesEjercicio.serviciosConAlgunFallo(HISTORIAL);
        assertEquals(2, conFallo.size());
        assertTrue(conFallo.contains(Datos.WEB));
        assertTrue(conFallo.contains(Datos.DNS));
    }

    @Test
    void cuentaLasComprobacionesDeCadaEstado() {
        var porEstado = InformesEjercicio.comprobacionesPorEstado(HISTORIAL);
        assertEquals(2L, porEstado.get(Estado.ACTIVO));
        assertEquals(1L, porEstado.get(Estado.DEGRADADO));
        assertEquals(2L, porEstado.get(Estado.CAIDO));
    }

    @Test
    void agrupaLosServiciosPorSuUltimoEstado() {
        var porUltimo = InformesEjercicio.serviciosPorUltimoEstado(HISTORIAL);
        assertEquals(List.of(Datos.WEB), porUltimo.get(Estado.CAIDO));
        assertEquals(List.of(Datos.DNS), porUltimo.get(Estado.ACTIVO));
    }
}
