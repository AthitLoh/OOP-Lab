/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.oop;

import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Q6 {
    public static void main(String [] args) {
		DecimalFormat formatter = new DecimalFormat("#0.00");
		//
		Scanner in = new Scanner(System.in);
		
		int units = in.nextInt();
		double price = in.nextDouble();
                
		if(units<=35) {
			price = 85;
			System.out.println("Charge 85 baht");
		}
		else if(units>35 && units<151) {
			price = 85;
			for(int i = 35; i < units ; i++) {
				price = price + 1.12;
			}
			System.out.println("Charge " +formatter.format(price)+" Baht");
		}
		else if(units>150 && units<401) {
			price = 213.8;
			for(int i = 151 ; i<units ; i++)
				price = price + 2.13;
			
			System.out.println("Charge " +formatter.format(price)+ " Baht");
			
		}
		else if(units>400) {
			price = 746.3;
			for(int i = 400; i< units ; i++) {
				price = price + 2.42;
			}
			
			System.out.println("Charge " +formatter.format(price)+ " Baht");
		}
	}
}
