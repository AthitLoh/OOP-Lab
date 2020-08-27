/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.oop;

/**
 *
 * @author coc
 */
public class Q1 {

public static float celsiusToFahrenheit(float Celsius) {

// Implement this
    float Fahrenheit = ((Celsius * 9)/5)+32;
    return Fahrenheit;
}

public static void main(String[] args) {

System.out.println(celsiusToFahrenheit(52)); // Expected result?

System.out.println(celsiusToFahrenheit(0)); // Expected result?

}

}
