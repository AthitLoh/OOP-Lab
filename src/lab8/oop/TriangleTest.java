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
public class TriangleTest {
    public static void main(String[] args) {
        EquilateralTriangle e1 = new EquilateralTriangle(10);
        System.out.println(e1.getLargestAngle());
        System.out.println(e1.getLongestSideLength());
        System.out.println(e1.getPerimiter());

        RightTriangle r1 = new RightTriangle(3.0,4.0,5.0);
        System.out.println(r1.getLargestAngle());
        System.out.println(r1.getLongestSideLength());
        System.out.println(r1.getPerimiter());
    }
}
