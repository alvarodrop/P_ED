package org.example;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Mostrar el menú de opciones
        System.out.println("Calculadora Básica");
        System.out.println("Selecciona una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Potencia");
        System.out.print("Ingresa el número de la operación: ");

        int opcion = scanner.nextInt();

        // Pedir los dos números para realizar la operación
        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();

        // Realizar la operación según la opción seleccionada
        switch (opcion) {
            case 1:
                System.out.println("Resultado de la suma: " + sumar(num1, num2));
                break;
            case 2:
                System.out.println("Resultado de la resta: " + restar(num1, num2));
                break;
            case 3:
                System.out.println("Resultado de la multiplicación: " + multiplicar(num1, num2));
                break;
            case 4:
                // Verificar que el divisor no sea cero antes de realizar la división
                if (num2 != 0) {
                    System.out.println("Resultado de la división: " + dividir(num1, num2));
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
            case 5:
                System.out.println("Resultado de la potencia: " + potencia(num1, num2));
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        // Cerrar el scanner
        scanner.close();
    }

    // Método para realizar la suma
    public static double sumar(double a, double b) {
        return a + b;
    }

    // Método para realizar la resta
    public static double restar(double a, double b) {
        return a - b;
    }

    // Método para realizar la multiplicación
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Método para realizar la división
    public static double dividir(double a, double b) {
        return a / b;
    }

    // Método para realizar la potencia
    public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }
}
