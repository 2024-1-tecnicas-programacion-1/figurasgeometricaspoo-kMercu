package com.mycompany.figurasgeometricaspoo;

public class Triangulo extends FiguraGeometrica {
    double base;
    double altura;

    public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    double obtenerArea() {
        return (base * altura) / 2;
    }

    double obtenerPerimetro() {
        return 3 * base;
    }
}