package es.uib.prgava.tema1.ejercicios;

import org.junit.jupiter.api.Test;

import es.uib.prgava.tema1.poo.DispositivoRed;
import es.uib.prgava.tema1.poo.Enrutador;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/** Ejercicio 1.1.4. */
class PuntoAccesoTest {

    private static PuntoAcceso nuevo() {
        return new PuntoAcceso("ap-planta2", "10.0.2.15", "UIB-Invitados", 6);
    }

    @Test
    void loHeredadoSigueFuncionandoSinReescribirlo() {
        var ap = nuevo();
        assertEquals("ap-planta2", ap.getNombre());
        assertEquals("10.0.2.15", ap.getDireccionIp());
        ap.activar();
        assertTrue(ap.isActivo());
    }

    @Test
    void elCanalSeValidaEnElConstructor() {
        assertThrows(IllegalArgumentException.class,
                () -> new PuntoAcceso("ap", "10.0.0.1", "red", 0));
        assertThrows(IllegalArgumentException.class,
                () -> new PuntoAcceso("ap", "10.0.0.1", "red", 14));
    }

    @Test
    void elCanalSeValidaTambienAlCambiarlo() {
        var ap = nuevo();
        ap.cambiarCanal(11);
        assertEquals(11, ap.getCanal());
        assertThrows(IllegalArgumentException.class, () -> ap.cambiarCanal(14));
        assertEquals(11, ap.getCanal());
    }

    @Test
    void elToStringLlevaLoHeredadoYLoPropio() {
        var texto = nuevo().toString();
        assertTrue(texto.contains("ap-planta2"));
        assertTrue(texto.contains("10.0.2.15"));
        assertTrue(texto.contains("UIB-Invitados"));
        assertTrue(texto.contains("6"));
    }

    @Test
    void elContadorDeLaSuperclaseCuentaLasDosSubclases() {
        int antes = DispositivoRed.getDispositivosCreados();
        new Enrutador("r1", "10.0.0.1", 24);
        nuevo();
        assertEquals(antes + 2, DispositivoRed.getDispositivosCreados());
    }
}
