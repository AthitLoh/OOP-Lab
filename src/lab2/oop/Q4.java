/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.oop;
import static java.lang.Integer.sum;
import java.util.Scanner;
/**
 *
 * @author coc
 */
public class Q4 {
    public static void evenSum1toN(int num) {

// Implement this
    int sum = 0;
    for(int i=0;i<=num;i++)
    if(i%2 == 0){
        sum = sum + i;
    }
    System.out.println(sum);
}
    

public static void main(String[] args) {

Scanner in = new Scanner(System.in);

    int num;
        num = in.nextInt();
        evenSum1toN(num);
 }
}
