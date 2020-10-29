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
public class ESportsClubTest {
    public static void main(String [] args){
        ESportsClub e = new ESportsClub("Esport", 100);
        e.advertise();
        e.determineBudget();
        e.getName();
        //Club c = ESportsClub("Esport", 100);
    }
}
