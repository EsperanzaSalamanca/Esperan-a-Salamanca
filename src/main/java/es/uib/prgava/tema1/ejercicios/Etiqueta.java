// Etiqueta.java
package es.uib.prgava.tema1.ejercicios;

public class Etiqueta {

    private final String texto;
    private final String color;

    public Etiqueta(String texto, String color) {
        this.texto = texto;
        this.color = color;
    }

    public String texto() { return texto; }

    public String color() { return color; }

    @Override
    public boolean equals(Object otro) {
        Etiqueta esa = (Etiqueta) otro;
        return texto.equals(esa.texto) && color.equals(esa.color);
    }

    @Override
    public String toString() {
        return "Etiqueta[" + texto + ", " + color + "]";
    }
}
