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
public class RightTriangle implements Triangle{
    protected double side1;
    protected double side2;
    protected double side3;
    
    public RightTriangle(double side1,double side2,double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    @Override
    public double getLongestSideLength(){
        double max = this.side1 > this.side2 ? this.side1 : this.side2;
//        if(this.side1 > this.side2){
//           max = this.side1;
//        }
//        else max  = this.side2;
//        if(this.side3 > max){
//           max = this.side3;
//        }

        return this.side3 > max ? this.side3 : max;
    }
    
    @Override 
    public double getLargestAngle(){
        return 90.0;
    }
    
    @Override 
    public double getPerimiter(){
        return this.side1 + this.side2 + this.side3;
    }
     
}
