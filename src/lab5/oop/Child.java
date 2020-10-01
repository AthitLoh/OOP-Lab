/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.oop;

/**
 *
 * @author coc
 */
public class Child extends Person{
    protected Person guardian;
    protected int age;
    protected int height;
    protected double weight;
    
    public Child(int age,int height,double weight){
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    
    public void setGuardian(Person guardian){
        this.guardian = guardian;
    }
    
    public Person getGuardian(){
        return this.guardian;
    }
}
