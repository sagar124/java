/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.sms;

import java.util.Scanner;

/**
 *
 * @author sohn
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] names = new String[10];
        int counter = 0;
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Welcome to the School Management System");
            System.out.println("1.Add Student");
            System.out.println("2.Delete Student");
            System.out.println("3.Show All");
            System.out.println("4.Search");
            System.out.println("5.Exit");
            System.out.println("Enter your choice[1-5]");

            int choice = input.nextInt();

            if (choice == 1) {
                while (true) {
                    System.out.println("Add Student");
                    System.out.println("Enter your name:");
                    names[counter] = input.next();
                    counter++;
                    System.out.println("Do you want to continue[Y/N]:");
                    if (input.next().equalsIgnoreCase("n")) {
                        break;
                    }

                }

            } else if (choice == 2) {
                System.out.println("Delete Student");
            } else if (choice == 3) {
                System.out.println("Show All");
                for (int i = 0; i < names.length; i++) {
                    if (names[i] != null) {
                        System.out.println(names[i]);

                    }
                }
            } else if (choice == 4) {
                System.out.println("Enter any text to search");
                String name = input.next();
                boolean found = false;
                for (int i = 0; i < names.length; i++) {
                    if (names[i] != null && names[i].contains(name)) {
                        System.out.println(names[i]);
                        found = true;

                    }
                }
                if (!found) {
                    System.out.println("No Name found");
                }
            } else {
                System.exit(0);
            }

        }

    }
}

     //To change body of generated methods, choose Tools | Templates1

