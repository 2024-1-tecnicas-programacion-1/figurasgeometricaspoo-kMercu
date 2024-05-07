package com.mycompany.figurasgeometricaspoo;

import java.util.Scanner;

/**
* Complejidad temporal: O(1) - Tiempo constante.
*/

public class Principal {
    
    /**
    * Complejidad temporal: O(1) - Tiempo constante.
    */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la figura:");
        String nombre = sc.nextLine();

        System.out.println("Ingrese el color de la figura:");
        String color = sc.nextLine();

        System.out.println("Ingrese el tipo de figura (1: Círculo, 2: Rectángulo, 3: Triángulo):");
        int tipoFigura = sc.nextInt();

        switch (tipoFigura) {
            
            case 1: // Círculo
                
                System.out.println("Ingrese el radio del círculo:");
                    double radioCirculo = sc.nextDouble();
                    
                Circulo circulo = new Circulo(nombre, color, radioCirculo);
                System.out.println("Área del círculo: " + circulo.obtenerArea());
                System.out.println("Perímetro del círculo: " + circulo.obtenerPerimetro());
                break;
                
                
            case 2: // Rectángulo
                System.out.println("Ingrese el valor del lado 1 del rectángulo:");
                    double lado1Rectangulo = sc.nextDouble();
                System.out.println("Ingrese el valor del lado 2 del rectángulo:");
                    double lado2Rectangulo = sc.nextDouble();
                    
                Rectangulo rectangulo = new Rectangulo(nombre, color, lado1Rectangulo, lado2Rectangulo);
                System.out.println("Área del rectángulo: " + rectangulo.obtenerArea());
                System.out.println("Perímetro del rectángulo: " + rectangulo.obtenerPerimetro());
                break;
                
            case 3: // Triángulo
                
                System.out.println("Ingrese el valor de la base del triángulo:");
                    double baseTriangulo = sc.nextDouble();
                System.out.println("Ingrese el valor de la altura del triángulo:");
                    double alturaTriangulo = sc.nextDouble();
                    
                Triangulo triangulo = new Triangulo(nombre, color, baseTriangulo, alturaTriangulo);
                System.out.println("Área del triángulo: " + triangulo.obtenerArea());
                System.out.println("Perímetro del triángulo: " + triangulo.obtenerPerimetro());
                break;
                
            default:
                System.out.println("Tipo de figura no válido.");
        }

        sc.close();
    }
}
