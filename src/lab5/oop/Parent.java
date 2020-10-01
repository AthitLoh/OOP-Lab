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
public class Parent extends Person {
    protected Child child;
    protected int money;
    
    public Parent(int money){
        this.money = money;
    }
    
    public void setChild(Child child){
        this.child = child;
    }
    
    public Child getChild(){
        return this.child;
    }
}
