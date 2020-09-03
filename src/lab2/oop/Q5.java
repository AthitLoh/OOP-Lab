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

public class Q5 {
    
   public static int largestSum(int arr[]){
        int max = 0;
        for(int i = 0; i < arr.length ; ++i){
            if (arr[i]>max) 
                max = arr[i];
        }
        return max;
    }    
    public static float averageNum(int arr[]){
        float sum = 0;
        for(int i = 0; i < arr.length ; i++ ){
             sum += arr[i];
        }
        return  sum/arr.length;
    }
    public static void main(String [] args){   
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of variables: ");
        int numArr = in.nextInt();
        int [] arr = new int [numArr]; 
        for(int i = 0; i < numArr ; i++){
           System.out.print("Enter num: ");
           arr[i] = in.nextInt();
        }
        int max = largestSum(arr);
        System.out.println("Max int is "+max);
        System.out.println("AVG float is "+averageNum(arr));
    }
            
}
        
     
