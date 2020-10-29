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
public class ClubManagingSystemTest {
    public static void main(String [] args){
        Club stdClub = new Club("Student", 10);
        stdClub.addMember(190);
        
        
        
        Club[] cl = {stdClub};
        ClubManagingSystem sys = new ClubManagingSystem(cl);
        
        
    }
}
