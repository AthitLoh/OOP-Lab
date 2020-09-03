/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.oop;

import java.util.Scanner;
/**
 *
 * @author User
 */
public class Q6 {
    public static void main(String[] arge){
    float total=0;
    float charge ;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter charge: ");
    charge = in.nextFloat();
    
    total += 85;
    charge -= 35;
    if(charge > 0){
        if(charge > 150){
            total += 115 * 1.12;
        }
        else
        total += charge * 1.12;
        charge -= 115;
        
    }
    if(charge > 0){
        total += charge * 2.13;
    }
    System.out.println(total);
}
}
