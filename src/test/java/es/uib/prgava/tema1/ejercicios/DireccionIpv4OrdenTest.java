package es.uib.prgava.tema1.ejercicios;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/** Ejercicio 1.1.8. */
class DireccionIpv4OrdenTest {

    @Test
    void ordenaPorElPrimerOcteto() {
        var direcciones = new DireccionIpv4[] {
                new DireccionIpv4(10, 0, 0, 5),
                new DireccionIpv4(9, 255, 255, 255)
        };
        Arrays.sort(direcciones);
        assertEquals(new DireccionIpv4(9, 255, 255, 255), direcciones[0]);
    }

    @Test
    void aIgualdadDelPrimeroDecideElSiguiente() {
        var direcciones = new DireccionIpv4[] {
                new DireccionIpv4(10, 0, 0, 5),
                new DireccionIpv4(10, 0, 0, 1),
                new DireccionIpv4(10, 0, 1, 0),
                new DireccionIpv4(10, 1, 0, 0)
        };
        Arrays.sort(direcciones);
        assertArrayEquals(new DireccionIpv4[] {
                new DireccionIpv4(10, 0, 0, 1),
                new DireccionIpv4(10, 0, 0, 5),
                new DireccionIpv4(10, 0, 1, 0),
                new DireccionIpv4(10, 1, 0, 0)
        }, direcciones);
    }

    @Test
    void elSignoEsLoUnicoQueImporta() {
        var menor = new DireccionIpv4(10, 0, 0, 1);
        var mayor = new DireccionIpv4(200, 0, 0, 1);
        assertTrue(menor.compareTo(mayor) < 0);
        assertTrue(mayor.compareTo(menor) > 0);
    }

    @Test
    void elOrdenEsCoherenteConLaIgualdad() {
        var una = new DireccionIpv4(192, 168, 1, 1);
        var otra = new DireccionIpv4(192, 168, 1, 1);
        assertEquals(0, una.compareTo(otra));
        assertEquals(una.equals(otra), una.compareTo(otra) == 0);
    }
}
