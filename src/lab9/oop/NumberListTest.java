/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9.oop;

/**
 *
 * @author coc
 */
public class NumberListTest {
    public static void main (String [] args){
    
        try{
            Integer [] array = {4,2,8,7};
            NumberList n1 = new NumberList(array);
            n1.setElement(-1,8);
            System.out.println(n1.divideElement(3,0));
        }catch(ArrayIndexOutOfBoundsException n){
            System.out.println("Your array are not exist");
        }        
        try{
            Integer [] array = {4,2,8,7};
            NumberList n1 = new NumberList(array);
            n1.setElement(0,8);
            System.out.println(n1.divideElement(2,0));
        }catch(ArithmeticException n2){
            System.out.println("element can't be 0");
        }
        finally{
            System.out.println("All exception handled");
        }
    }
        //n1.setElement(4,8);
        //n1.setElement(-1,8);
        //System.out.println(n1.divideElement(0,8));
        //System.out.println(n1.divideElement(2,0));
        
}

