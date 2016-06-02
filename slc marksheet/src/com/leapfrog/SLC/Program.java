/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.SLC;

/**
 *
 * @author sohn
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "Sagar", grade = "";
        String symbol = "12345xyz";

        double cmath = 67, optmath = 80, sc = 72, nep = 66, eng = 78, percentage = 0;

        if (cmath < 32 || optmath < 32 || sc < 32 || nep < 32 || eng < 32) {
            System.out.println("you are fail");
        }
        else{
            
            percentage=((cmath+optmath+sc+nep+eng)/500)*100;
            
            if(percentage >=80){
                grade="Distinction";
            }
            else if(percentage>=60){
                grade="first division";
            }
            System.out.println(" your percentage is "+ percentage);
            System.out.println(" your grade is "+ grade);
        }
    }

}
