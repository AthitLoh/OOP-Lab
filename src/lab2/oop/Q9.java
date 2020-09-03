/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.oop;


import java.util.Scanner;

/**
 *
 * @author coc
 */
public class Q9 {
    public static void main(String [] args){
       Scanner in = new Scanner(System.in);
       System.out.println("Input the number of elements to store in the array: ");
        int numArr = in.nextInt();
        int []str = new int [numArr]; 
        for(int i = 0; i < numArr ; i++){
           System.out.print("Enter num: ");
           str[i] = in.nextInt();
        }
        System.out.println("The values store into the array are : "); 
        for(int i = 0; i < numArr ; i++){
           System.out.print(str[i]);
        }
        System.out.println();
        System.out.println("The values store into the array in reverse are : ");
        for(int i = numArr-1; i >= 0 ; i--){
           System.out.print(str[i]);
        }      
    }
}