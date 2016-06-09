/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.arrayexample;

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
        try {
            int[] nums = {10, 12, 3, 1, 2, 5, 6};

            int length = nums.length;

            for (int i = 0; i < length; i++) {
                if ((nums[i] % 2) == 0) {
                    System.out.println(nums[i]);
                }
                if ((nums[i] % 2) != 0) {
                    System.out.println(nums[i]);
                }

            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        
    }
    public static void min() {
        int fullmarks = 100;
        int passMarks = 32;
        boolean isFail = false;
        Scanner input = new Scanner(System.in);
    }

}
