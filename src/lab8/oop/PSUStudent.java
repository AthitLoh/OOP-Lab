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
public abstract class PSUStudent {
    protected int age;
    protected double gpa;
    
    public PSUStudent(int age, double gpa){
        this.age = age;
        this.gpa = gpa;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    
    public abstract double getGrade();
}
