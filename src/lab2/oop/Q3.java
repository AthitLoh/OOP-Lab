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
public class Q3 {
    public static void printWeather(int temp) {

// Implement this
    if(temp<0){
        System.out.println("Freezing weather");
    } 
    else if(temp>=0 && temp <= 10){
        System.out.println("Very Cold weather");
    } 
    else if(temp>10 && temp <= 20){
        System.out.println("Cold weather");
    } 
    else if(temp>20 && temp <= 30){
        System.out.println("Normal in Temp");
    } 
    else if(temp>30 && temp <= 40){
        System.out.println("Its Hot");
    } 
    else if(temp>40 ){
        System.out.println("Its Very Hot");
    } 
    
}

public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    int temp;
        temp = in.nextInt();
        printWeather (temp);
}
}
