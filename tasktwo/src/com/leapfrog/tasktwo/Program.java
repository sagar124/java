/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.tasktwo;



import com.leapfrog.tasktwo.util.calculatorHelper;
import com.leapfrog.tasktwo.entity.Student;
/**
 *
 * @author sohn
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       calculatorHelper ch=new calculatorHelper();
       
        System.out.println(ch.add(2, 10));
        System.out.println(ch.sub(3, 5));
        System.out.println(ch.mul(2, 2));
        System.out.println(ch.div(6, 3));
        
        Student student=new Student();
        student.setId(1);
        student.setFirstName("sagar");
        student.setLastName("ghimire");
        student.setEmail("sagar_2all12@yahoo.com");
        student.setStatus(true);
        
        System.out.println(student.getFirstName() + student.getLastName());
        
        
        
        
        
    }
     
    }
        
    
    

