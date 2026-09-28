package es.uib.prgava.tema1.ejercicios;

import java.util.List;
import java.util.Map;

import es.uib.prgava.tema1.monitor.Estado;
import es.uib.prgava.tema1.monitor.Resultado;
import es.uib.prgava.tema1.monitor.Servicio;

/**
 * Ejercicios 1.3.5 y 1.3.6. Informes sobre un historial con la Stream API.
 *
 * <p>Cada método es una tubería que se lee de arriba abajo. El modelo es la clase
 * {@code Informes} del monitor.
 */
public final class InformesEjercicio {

    private InformesEjercicio() { }

    /** Cuántos fallos hay en el historial. */
    public static long fallos(List<Resultado> historial) {
        // TODO 1.3.5
        throw new UnsupportedOperationException("TODO 1.3.5: InformesEjercicio.fallos");
    }

    /** Latencia media en milisegundos. Decide qué devolver con el historial vacío. */
    public static double latenciaMediaEnMilisegundos(List<Resultado> historial) {
        // TODO 1.3.5
        throw new UnsupportedOperationException(
                "TODO 1.3.5: InformesEjercicio.latenciaMediaEnMilisegundos");
    }

    /** Servicios con al menos un fallo, sin repeticiones. */
    public static List<Servicio> serviciosConAlgunFallo(List<Resultado> historial) {
        // TODO 1.3.5
        throw new UnsupportedOperationException(
                "TODO 1.3.5: InformesEjercicio.serviciosConAlgunFallo");
    }

    /** Cuántas comprobaciones hay de cada estado. Te bastan groupingBy y counting. */
    public static Map<Estado, Long> comprobacionesPorEstado(List<Resultado> historial) {
        // TODO 1.3.6
        throw new UnsupportedOperationException(
                "TODO 1.3.6: InformesEjercicio.comprobacionesPorEstado");
    }

    /** Servicios agrupados por su estado más reciente. */
    public static Map<Estado, List<Servicio>> serviciosPorUltimoEstado(List<Resultado> historial) {
        // TODO 1.3.6
        throw new UnsupportedOperationException(
                "TODO 1.3.6: InformesEjercicio.serviciosPorUltimoEstado");
    }

    // TODO 1.3.5: elige uno de los tres primeros y escríbelo también con un bucle, en un
    // método aparte, para poder comparar las dos versiones.
}
