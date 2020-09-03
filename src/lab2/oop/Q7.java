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
public class Q7 {
    public static void printLeftPyramid(int num) {
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printPyramid(int num) {
         
        for(int i = num; i > 0; i--){
            for(int j = i;j>1;j--)
            {
                System.out.print(" ");
            }
            for(int j = i; j<num; j++)
            {
                System.out.print("*");
            }
            for(int j = i; j<=num ; j++)
            {
                System.out.print("*");
            }
            for(int j = i; j>1; j--)
            {
                System.out.print(" ");
            }           
         System.out.println("");   
     
    }       
  
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num;
        num = in.nextInt();
        printLeftPyramid(num);
        printPyramid(num);

}
}
