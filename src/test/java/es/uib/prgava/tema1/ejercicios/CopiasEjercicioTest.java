package es.uib.prgava.tema1.ejercicios;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import es.uib.prgava.tema1.monitor.Servicio;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Ejercicio 1.3.3. Aquí lo que se comprueba es que <em>compile</em>: las dos llamadas del final
 * están comentadas porque con la firma actual no compilan. Descoméntalas cuando apliques PECS.
 */
class CopiasEjercicioTest {

    @Test
    void copiaEntreListasDelMismoTipo() {
        var origen = new ArrayList<Servicio>(List.of(Datos.WEB, Datos.DNS));
        var destino = new ArrayList<Servicio>();
        CopiasEjercicio.copiarTodo(origen, destino);
        assertEquals(2, destino.size());
        assertEquals(Datos.WEB, destino.get(0));
    }

    @Test
    void elDestinoConservaLoQueYaTenia() {
        var destino = new ArrayList<Servicio>(List.of(Datos.DNS));
        CopiasEjercicio.copiarTodo(new ArrayList<Servicio>(List.of(Datos.WEB)), destino);
        assertEquals(2, destino.size());
    }

    // TODO 1.3.3: descomenta estas dos pruebas cuando hayas corregido la firma.
    //
    // @Test
    // void copiaDesdeUnaListaDeUnSubtipo() {
    //     var origen = new ArrayList<ServicioDns>(List.of(new ServicioDns("uib.es")));
    //     var destino = new ArrayList<Servicio>();
    //     CopiasEjercicio.copiarTodo(origen, destino);
    //     assertEquals(1, destino.size());
    // }
    //
    // @Test
    // void copiaHaciaUnaListaDeUnSupertipo() {
    //     var destino = new ArrayList<Object>();
    //     CopiasEjercicio.copiarTodo(new ArrayList<Servicio>(List.of(Datos.WEB)), destino);
    //     assertEquals(1, destino.size());
    // }
}
