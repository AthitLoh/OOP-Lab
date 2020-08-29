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
public class Q2 {
    public static boolean passGrade(float Score) {

// Implement this
      return Score >= 2.0 && Score <= 4.0;
}

    public static void main(String[] args) {

        System.out.println(passGrade(5)); // Expected result?

        System.out.println(passGrade((float)4.0)); // Expected result?

}
  
}
