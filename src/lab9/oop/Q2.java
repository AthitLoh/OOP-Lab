/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9.oop;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Q2 {
    public static void getArrayFromUser (Scanner scan){
        System.out.println("Enter number of variables: ");
        int numArr = scan.nextInt();
        int [] arr = new int [numArr]; 
        for(int i = 0; i < numArr ; i++){
           System.out.print("Enter num: ");
           arr[i] = scan.nextInt();
        }
        for(int i = 0; i < numArr ; i++){
           System.out.println(arr[i]);
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        sc.close();
        try{
           getArrayFromUser(sc); 
        }catch(IllegalStateException e){
            System.out.print(e +"  Scanner is closed, returning");
        }
        
    }
}
