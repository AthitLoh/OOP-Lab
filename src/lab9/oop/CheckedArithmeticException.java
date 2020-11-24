/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9.oop;

/**
 *
 * @author User
 */
public class CheckedArithmeticException extends Exception {
    public CheckedArithmeticException(){
        super("Your syntax are invalid");
    }
    public CheckedArithmeticException(String messageError){
        super(messageError);
    }
}
