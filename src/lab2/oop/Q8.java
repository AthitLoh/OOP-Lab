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
public class Q8 {
    public static boolean primeNum(int num) 
{ 
    // Corner case 
    if (num <= 1)  return false; 
  
    // Check from 2 to n-1 
    for (int i=2; i<num; i++) 
        if (num%i == 0) 
            return false; 
    return true; 
}   
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter test number: ");
        int checkNum = in.nextInt();
        
        if(primeNum(checkNum)) System.out.println("true");
        else System.out.println("false");
    }
    
}
