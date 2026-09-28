// PanelDeEstadoHeredado.java
package es.uib.prgava.tema1.ejercicios;

import es.uib.prgava.tema1.poo.RegistroEventos;

public class PanelDeEstadoHeredado extends RegistroEventos {

    private int registrados = 0;

    @Override
    public void registrar(String evento) {
        registrados++;
        super.registrar(evento);         // y `registrarVarios` se hereda tal cual
    }

    public int registrados() { return registrados; }

    public String resumen() { return registrados + " eventos registrados"; }
}
