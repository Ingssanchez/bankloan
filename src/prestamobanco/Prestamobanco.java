/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
/**
 *
 * @author Sergio Sanchez 20241222424 Celular 3208689548
 */
package prestamobanco; 

import java.util.Scanner;

public class Prestamobanco{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "si";
        double totalPrestamos = 0.0;
        double totalEquipoComputo = 0.0;
        double totalMobiliario = 0.0;
        double totalInsumosIncentivos = 0.0;

        // Agrega múltiples ingresos de capital
        do {
            System.out.print("Ingrese el valor del capital: USD$");
            double capital = scanner.nextDouble();

            double prestamo = 0.0;

            // Condicional para el préstamo
            if (capital < 0) {
                prestamo = 10000.0;
            } else if (capital >= 0 && capital <= 20000) {
                prestamo = 20000.0;
            } 

            totalPrestamos += prestamo;

            double equipoComputo = 0.0;
            double mobiliario = 0.0;
            double insumosIncentivos = 0.0;

            // En caso de cumplir requisitos del préstamo
            if (prestamo > 0) {
                equipoComputo = 5000.0;
                mobiliario = 2000.0;
                insumosIncentivos = (prestamo - equipoComputo - mobiliario) / 2;

                totalEquipoComputo += equipoComputo;
                totalMobiliario += mobiliario;
                totalInsumosIncentivos += insumosIncentivos;
            }

            // Viabilidad del crédito bancario de acuerdo al riesgo
            double saldo = capital + prestamo - equipoComputo - mobiliario - insumosIncentivos;
            String viabilidad = (saldo >= 0) ? "Crédito viable" : "Crédito inviable";

            // Presentación de la información del crédito bancario
            System.out.println("\n-------------------------------------------------------------------");
            System.out.println("| Concepto        | Valor (USD$)                |");
            System.out.println("-------------------------------------------------------------------");
            System.out.printf("| Capital inicial | %25.2f |\n", capital);
            System.out.printf("| Préstamo        | %25.2f |\n", prestamo);
            System.out.printf("| Equipo computo  | %25.2f |\n", equipoComputo);
            System.out.printf("| Mobiliario      | %25.2f |\n", mobiliario);
            System.out.printf("| Insumos/Incentivos| %25.2f |\n", insumosIncentivos);
            System.out.printf("| Saldo           | %25.2f |\n", saldo);
            System.out.printf("| Viabilidad      | %25s |\n", viabilidad);
            System.out.println("-------------------------------------------------------------------");

            System.out.print("\n¿Desea ingresar otro capital? (si/no): ");
            continuar = scanner.next().toLowerCase();

        } while (continuar.equals("si"));

        // Presentar balances del préstamo bancario
        System.out.println("\n---------------------------------------------------------------");
        System.out.println("| Balance Préstamo Bancario        | Total Acumulado (USD$)      |");
        System.out.println("------------------------------------------------------------------");
        System.out.printf("| Préstamos| %25.2f|\n", totalPrestamos);
        System.out.printf("| Equipo computo| %25.2f|\n", totalEquipoComputo);
        System.out.printf("| Mobiliario| %25.2f|\n", totalMobiliario);
        System.out.printf("| Insumos/Incentivos| %25.2f|\n", totalInsumosIncentivos);
        System.out.println("----------------------------------------------");

        scanner.close();
    }
}