package es.uib.prgava.tema1.ejercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/** Ejercicio 1.3.2. */
class UtilidadesEjercicioTest {

    @Test
    void mayorFuncionaConEnteros() {
        assertEquals(Integer.valueOf(7), UtilidadesEjercicio.mayor(3, 7));
    }

    @Test
    void mayorFuncionaConCadenas() {
        assertEquals("pera", UtilidadesEjercicio.mayor("manzana", "pera"));
    }

    @Test
    void mayorFuncionaConTusDirecciones() {
        var menor = new DireccionIpv4(10, 0, 0, 1);
        var mayor = new DireccionIpv4(10, 0, 0, 2);
        assertEquals(mayor, UtilidadesEjercicio.mayor(menor, mayor));
    }

    @Test
    void contarIgualesUsaEquals() {
        var direcciones = new DireccionIpv4[] {
                new DireccionIpv4(10, 0, 0, 1),
                new DireccionIpv4(10, 0, 0, 2),
                new DireccionIpv4(10, 0, 0, 1)
        };
        assertEquals(2, UtilidadesEjercicio.contarIguales(direcciones, new DireccionIpv4(10, 0, 0, 1)));
    }

    @Test
    void contarIgualesDevuelveCeroSiNoHayNinguno() {
        assertEquals(0, UtilidadesEjercicio.contarIguales(new String[] { "a", "b" }, "z"));
    }
}
