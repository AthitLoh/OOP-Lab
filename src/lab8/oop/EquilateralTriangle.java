/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8.oop;

/**
 *
 * @author coc
 */
public class EquilateralTriangle implements Triangle {
    protected double side;
    
    public EquilateralTriangle(double s){
        this.side = s;
    }
    
    @Override
    public double getLongestSideLength(){
        return this.side;
    }
    
    @Override 
    public double getLargestAngle(){
        return 60.0;
    }
    
    @Override 
    public double getPerimiter(){
        return this.side * 3;
    }
    
}
