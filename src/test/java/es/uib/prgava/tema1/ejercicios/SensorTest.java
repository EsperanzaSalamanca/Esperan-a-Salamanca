package es.uib.prgava.tema1.ejercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/** Ejercicio 1.1.6. */
class SensorTest {

    @Test
    void cadaSubclaseLeeLoSuyo() {
        assertEquals(21.5, new SensorTemperatura("sala-3", 21.5).leer());
        assertEquals(48.0, new SensorHumedad("sala-3", 48.0).leer());
    }

    @Test
    void describirEstaEscritoUnaSolaVezYSirveParaLasDos() {
        Sensor temperatura = new SensorTemperatura("sala-3", 21.5);
        Sensor humedad = new SensorHumedad("sala-3", 48.0);
        assertEquals("temperatura en sala-3: 21.5", temperatura.describir());
        assertEquals("humedad en sala-3: 48.0", humedad.describir());
    }

    @Test
    void laUbicacionSeGuardaEnLaClaseAbstracta() {
        assertEquals("sala-3", new SensorTemperatura("sala-3", 0.0).ubicacion());
    }
}
