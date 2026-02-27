package com.hospital.robotics;

import com.hospital.robotics.factory.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Robotic Surgery System ===\n");
        System.out.println("Choose the type of robot:");
        System.out.println("1. German Robot (millimeter precision)");
        System.out.println("2. Japanese Robot (optimized speed)");
        System.out.print("\nOption (1 or 2): ");
        
        String option = scanner.nextLine();
        SurgeryRobotFactory factory;
        
        if (option.equals("2")) {
            factory = new JapaneseRobotFactory();
            System.out.println("\n✓ Japanese robot selected\n");
        } else {
            factory = new GermanRobotFactory();
            System.out.println("\n✓ German robot selected\n");
        }
        
        SurgerySystem system = new SurgerySystem(factory);
        
        System.out.println("--- Starting surgery ---");
        system.performSurgery();
        System.out.println("--- Surgery completed ---\n");
        
        scanner.close();
    }
}