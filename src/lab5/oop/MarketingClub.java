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
public class MarketingClub extends Club{
    protected int budget;
    
    public MarketingClub(String c,int m,int b){
        super(c,m);
        this.budget = b;       
    }
    
    public boolean useBudget(int b){
        if((this.budget-b)>=0){
            this.budget -= b;
            return true;
        }
        else return false;
    }
    @Override
    public int determineBudget(){
        if(budget>1000) return 0;
        else return (numMember*1000);
    }
}
