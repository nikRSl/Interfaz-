package com.hospital.robotics;

import com.hospital.robotics.factory.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Sistema de Cirugía Robótica ===\n");
        System.out.println("Elige el tipo de robot:");
        System.out.println("1. Robot Alemán (precisión milimétrica)");
        System.out.println("2. Robot Japonés (velocidad optimizada)");
        System.out.print("\nOpción (1 o 2): ");
        
        String opcion = scanner.nextLine();
        SurgeryRobotFactory factory;
        
        if (opcion.equals("2")) {
            factory = new JapaneseRobotFactory();
            System.out.println("\n✓ Robot Japonés seleccionado\n");
        } else {
            factory = new GermanRobotFactory();
            System.out.println("\n✓ Robot Alemán seleccionado\n");
        }
        
        SurgerySystem system = new SurgerySystem(factory);
        
        System.out.println("--- Iniciando cirugía ---");
        system.performSurgery();
        System.out.println("--- Cirugía completada ---\n");
        
        scanner.close();
    }
}