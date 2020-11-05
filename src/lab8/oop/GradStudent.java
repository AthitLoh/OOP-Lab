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
public class GradStudent extends PSUStudent {
    private int passThesis;
    public GradStudent (int age, double gpa){
        super(age,gpa);
        this.passThesis = 0;
    }
    
    public void setPassThesis(int passThesis){
        this.passThesis = passThesis;
    }
    
    @Override
    public double getGrade(){
        return this.gpa*this.passThesis;
    }
}
