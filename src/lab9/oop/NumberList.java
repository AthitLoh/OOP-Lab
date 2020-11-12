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
public class NumberList {
    private Integer [] inputArray;
    
    public NumberList(Integer [] inputArray){
   
        this.inputArray = inputArray;
    }
    
    public void setElement(int i, Integer element)throws ArrayIndexOutOfBoundsException{
       
        if(this.inputArray.length < 0 || i >= this.inputArray.length)
            throw new ArrayIndexOutOfBoundsException("Your array are not exist");
        this.inputArray[i] = element;

    }
    
    public double divideElement(int i, Integer element)throws ArithmeticException{ 
        
        if(element == 0) throw new ArithmeticException("element can't be 0");
        return this.inputArray[i]/element;

    }
}
