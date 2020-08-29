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
public class Q9 {
    public static int numDistinct(int str[],int size){
    int check = 0;

    for (int i = 0; i < size; i++){
         boolean characters = false;
         for (int j = 0; j < i; j++){
              if (str[j] == str[i]){
                  characters = true;
                  break;
              }
         }

         if (!characters){
             check ++;
         }
    }
    System.out.println(check);
    return 0;
}
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of variables: ");
        int numArr = in.nextInt();
        int []str = new int [numArr]; 
        for(int i = 0; i < numArr ; i++){
           System.out.print("Enter num: ");
           str[i] = in.nextInt();
        }
        numDistinct(str,numArr);
}
}
