/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.oop;

/**
 *
 * @author coc
 */
public class ESportsClub extends Club{
    public ESportsClub(String c, int m){
        super(c,1);
    }
    
    @Override
    public void advertise() {
        System.out.println("No need to advertise");
    }
    @Override
    public int determineBudget() {
        return ((numMember*1000)+(numMember-minNumMember)*100);
    }
    
    @Override
    public void changeName(String newName){
        this.clubName = this.clubName;
    }
    
    public int getNumMember(){
        return this.numMember;
    }
}
