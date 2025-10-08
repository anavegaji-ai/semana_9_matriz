package org.example;

import java.util.Scanner;
public class matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de estudiantes: ");
        int estudiantes = sc.nextInt();

        System.out.print("Ingrese el número de materias: ");
        int materias = sc.nextInt();

        double[][] notas = new double[estudiantes][materias];

        // Llenar la matriz de notas
        for (int i = 0; i < estudiantes; i++) {
            System.out.println("Estudiante " + (i + 1) + ":");
            for (int j = 0; j < materias; j++) {
                System.out.print("  Nota de materia " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();
            }
        }

        // Calcular y mostrar promedio por estudiante
        System.out.println("\nPromedio por estudiante:");
        for (int i = 0; i < estudiantes; i++) {
            double suma = 0;
            for (int j = 0; j < materias; j++) {
                suma += notas[i][j];
            }
            double promedio = suma / materias;
            System.out.println("  Estudiante " + (i + 1) + ": " + promedio);
        }

        // Calcular y mostrar promedio por materia
        System.out.println("\nPromedio por materia:");
        for (int j = 0; j < materias; j++) {
            double suma = 0;
            for (int i = 0; i < estudiantes; i++) {
                suma += notas[i][j];
            }
            double promedio = suma / estudiantes;
            System.out.println("  Materia " + (j + 1) + ": " + promedio);
        }
    }
}

