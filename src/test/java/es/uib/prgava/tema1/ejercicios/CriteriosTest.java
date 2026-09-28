package es.uib.prgava.tema1.ejercicios;

import java.util.List;

import org.junit.jupiter.api.Test;

import es.uib.prgava.tema1.monitor.Resultado;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/** Ejercicio 1.3.4: las lambdas se usan igual que se usaría una clase. */
class CriteriosTest {

    private static final List<Resultado> HISTORIAL = Datos.historialMezclado();

    @Test
    void siempreAlertaInclusoConHistorialVacio() {
        assertTrue(Criterios.SIEMPRE.debeAlertar(List.of()));
        assertTrue(Criterios.SIEMPRE.debeAlertar(HISTORIAL));
    }

    @Test
    void nuncaNoAlertaNiConTodoFallos() {
        assertFalse(Criterios.NUNCA.debeAlertar(HISTORIAL));
    }

    @Test
    void ultimoFalloMiraSoloElUltimo() {
        assertTrue(Criterios.ULTIMO_FALLO.debeAlertar(HISTORIAL));
        assertFalse(Criterios.ULTIMO_FALLO.debeAlertar(HISTORIAL.subList(0, 4)));
        assertFalse(Criterios.ULTIMO_FALLO.debeAlertar(List.of()));
    }

    @Test
    void alMenosDevuelveUnaPoliticaQueCuentaFallos() {
        assertTrue(Criterios.alMenos(2).debeAlertar(HISTORIAL));
        assertFalse(Criterios.alMenos(3).debeAlertar(HISTORIAL));
    }
}
