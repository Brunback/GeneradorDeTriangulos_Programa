/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brun
 */
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la longitud de los lados del triángulo:");
        System.out.print("Lado 1: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Lado 2: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Lado 3: ");
        double lado3 = scanner.nextDouble();

        System.out.print("Ingrese la altura del triángulo: ");
        double altura = scanner.nextDouble();

        // Verificar el tipo de triángulo
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Es un triángulo equilátero.");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("Es un triángulo isósceles.");
        } else {
            System.out.println("Es un triángulo escaleno.");
        }

        // Calcular los ángulos
        double angulo1, angulo2, angulo3;
        angulo1 = Math.toDegrees(Math.acos((Math.pow(lado2, 2) + Math.pow(lado3, 2) - Math.pow(lado1, 2)) / (2 * lado2 * lado3)));
        angulo2 = Math.toDegrees(Math.acos((Math.pow(lado1, 2) + Math.pow(lado3, 2) - Math.pow(lado2, 2)) / (2 * lado1 * lado3)));
        angulo3 = 180 - angulo1 - angulo2;

        System.out.println("Ángulo 1: " + angulo1 + " grados");
        System.out.println("Ángulo 2: " + angulo2 + " grados");
        System.out.println("Ángulo 3: " + angulo3 + " grados");

        // Calcular el área del triángulo
        double area = (lado1 * altura) / 2;
        System.out.println("El área del triángulo es: " + area);
    }
}

