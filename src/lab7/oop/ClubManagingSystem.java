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
public class ClubManagingSystem {
    private Club [] clubList;
    
    public ClubManagingSystem(Club[] clubList){
        this.clubList = clubList;
    }
    
    public int determineAllBuget(){
        int sum = 0;
        for(int i=0; i < clubList.length; i++){
            sum += clubList[i].determineBudget();
        }
        return sum;
    }
    
    public int getAllMembers(){
        int total = 0 ;
        for(int i=0; i < clubList.length; i++){
            total += clubList[i].numMember;
        }
        return total;        
    }
    
    public int getHighestMemberClub(){
        int max = 0;
        for(int i=0; i < clubList.length; i++){
            if(clubList[i].numMember > max){
                max = clubList[i].numMember;
            }
        }
        return max;
    }
    
}
