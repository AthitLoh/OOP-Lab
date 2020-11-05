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
public class UndergradStudent extends PSUStudent{
    private int currentYear;
    public UndergradStudent(int age, double gpa){
        super(age,gpa);
        this.currentYear = 1;
    }
    
    public void setCurrentYear(int currentYear){
        this.currentYear = currentYear;
    } 
    
    @Override
    public double getGrade(){
        return this.gpa*(1+this.currentYear/10.0);
    }
    
    
}
