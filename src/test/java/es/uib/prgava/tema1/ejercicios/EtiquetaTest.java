package es.uib.prgava.tema1.ejercicios;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/** Ejercicio 1.1.3: el contrato completo de equals y hashCode. */
class EtiquetaTest {

    private static final Etiqueta UNA = new Etiqueta("rack-3", "rojo");
    private static final Etiqueta IGUAL = new Etiqueta("rack-3", "rojo");
    private static final Etiqueta OTRA = new Etiqueta("rack-3", "azul");

    @Test
    void dosEtiquetasIgualesCompartenCodigoDeResumen() {
        assertEquals(UNA, IGUAL);
        assertEquals(UNA.hashCode(), IGUAL.hashCode());
    }

    @Test
    void elColorCuentaParaLaIgualdad() {
        assertFalse(UNA.equals(OTRA));
    }

    @Test
    void esReflexivoSimetricoYTransitivo() {
        assertTrue(UNA.equals(UNA));
        assertEquals(UNA.equals(IGUAL), IGUAL.equals(UNA));
        var tercera = new Etiqueta("rack-3", "rojo");
        assertTrue(UNA.equals(IGUAL) && IGUAL.equals(tercera) && UNA.equals(tercera));
    }

    @Test
    void compararConNullDevuelveFalseYNoRevienta() {
        assertFalse(UNA.equals(null));
    }

    @Test
    void compararConOtroTipoDevuelveFalseYNoRevienta() {
        assertFalse(UNA.equals("rack-3"));
    }

    @Test
    void funcionaComoElementoDeUnConjuntoHash() {
        var conjunto = new HashSet<Etiqueta>();
        conjunto.add(UNA);
        assertTrue(conjunto.contains(IGUAL));
        conjunto.add(IGUAL);
        assertEquals(1, conjunto.size());
    }
}
