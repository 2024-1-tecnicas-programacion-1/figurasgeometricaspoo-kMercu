package com.mycompany.figurasgeometricaspoo;

public class Circulo extends FiguraGeometrica {
    double radio;

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
