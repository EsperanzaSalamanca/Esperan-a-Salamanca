package es.uib.prgava.tema1.ejercicios;

import java.util.List;

import org.junit.jupiter.api.Test;

import es.uib.prgava.tema1.monitor.Resultado;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/** Ejercicio 1.3.1. */
class HistorialTest {

    @Test
    void funcionaConCadenas() {
        var historial = new Historial<String>(3);
        historial.anadir("a");
        historial.anadir("b");
        assertEquals(2, historial.tamano());
        assertEquals(List.of("a", "b"), historial.ultimos(2));
    }

    @Test
    void funcionaConResultados() {
        var historial = new Historial<Resultado>(2);
        for (var resultado : Datos.historialMezclado()) {
            historial.anadir(resultado);
        }
        assertEquals(2, historial.tamano());
    }

    @Test
    void alSuperarLaCapacidadSeDescartaElMasAntiguo() {
        var historial = new Historial<String>(2);
        historial.anadir("a");
        historial.anadir("b");
        historial.anadir("c");
        assertEquals(2, historial.tamano());
        assertEquals(List.of("b", "c"), historial.ultimos(2));
    }

    @Test
    void laListaQueDevuelveEsInmutable() {
        var historial = new Historial<String>(2);
        historial.anadir("a");
        var ultimos = historial.ultimos(1);
        assertThrows(UnsupportedOperationException.class, () -> ultimos.add("b"));
    }
}
