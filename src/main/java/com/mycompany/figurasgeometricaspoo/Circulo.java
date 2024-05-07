package com.mycompany.figurasgeometricaspoo;

/**
* Complejidad temporal: O(1) - Tiempo constante.
*/

public class Circulo extends FiguraGeometrica {
    double radio;
    
    /**
     * Complejidad temporal: O(1) - Tiempo constante.
     */
    
    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }

    double obtenerArea() {
        return Math.PI * radio * radio;
    }

    double obtenerPerimetro() {
        return 2 * Math.PI * radio;
    }
}
