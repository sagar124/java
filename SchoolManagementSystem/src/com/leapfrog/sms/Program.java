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
        Scanner input = new Scanner(System.in);
        StudentDAOImpl stdDAO = new StudentDAOImpl(input);
        while (true) {

            System.out.println("Welcome to the School Management System");
            stdDAO.menu();
            stdDAO.controller();

        }

    }
}

     //To change body of generated methods, choose Tools | Templates1

