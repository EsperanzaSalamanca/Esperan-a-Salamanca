// DemoEtiqueta.java
package es.uib.prgava.tema1.ejercicios;

import java.util.HashSet;

public final class DemoEtiqueta {
    public static void main(String[] args) {
        var a = new Etiqueta("rack-3", "rojo");
        var b = new Etiqueta("rack-3", "rojo");
        System.out.println(a.equals(b));

        var conjunto = new HashSet<Etiqueta>();
        conjunto.add(a);
        System.out.println(conjunto.contains(b));
        conjunto.add(b);
        System.out.println(conjunto.size());
    }
}
