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
public class ClubTest {
    public static void main(String [] args){
        SportsClub  s = new SportsClub ("Sport",8);
        MarketingClub m = new MarketingClub ("Bar",4,7);
        
        s.advertise();
        s.changeName("Mook");
        s.advertise();
        
        m.advertise();  
    }
}
