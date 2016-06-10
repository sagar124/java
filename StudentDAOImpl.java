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
public class StudentDAOImpl {

    String[] names = new String[10];
    int counter = 0;
    Scanner input;

    public StudentDAOImpl(Scanner input) {
        this.input = input;
    }

    public void menu() {
        System.out.println("1.Add Student");
        System.out.println("2.Delete Student");
        System.out.println("3.show all");
        System.out.println("4.Search");
        System.out.println("5.Exit");
        System.out.println("Enter your choice[1-5");
    }

    public void addStudent() {
        while (true) {
            System.out.println("add Student");
            System.out.println("Enter your name:");
            names[counter] = input.next();
            counter++;
            System.out.println("Do you want to continue[Y/N]:");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }

        }
    }

    public void showAll() {
        System.out.println("Show All");
        for (String name : names) {
            if (name != null) {
                System.out.println(name);
                System.out.println("Do you want to continue[Y/N]:");
            }
        }
    }

    public void search() {
        System.out.println("Enter any text to search");
        String name = input.next();
        boolean found = false;
        for (String name1 : names) {
            if (name1 != null && name1.contains(name)) {
                System.out.println(name1);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No Name found");
        }
    }

    public void controller() {
        int choice = input.nextInt();

        if (choice == 1) {
            addStudent();

        } else if (choice == 2) {
            System.out.println("Delete Student");
        } else if (choice == 3) {
            showAll();

        } else if (choice == 4) {

            search();
        } else {
            System.exit(0);
        }
    }

}
