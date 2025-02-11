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
public class Club {
   // name of the club
    protected String clubName;
    // minimum number of members in the club
    protected int minNumMember;
    // current number of members
    protected int numMember;

    public Club(String c, int m) {
        clubName = c;
        minNumMember = m;
        numMember = m;
    }

    public void addMember(int num) {
        numMember = numMember+num;
    }

    // Continue on the right-hand side
    public void changeName(String newName) {
        clubName = newName;
    }

    public String getName() {
        return clubName;
    }

    public int determineBudget() {
        return (numMember*1000);
    }
    
    public void advertise() {
        System.out.println("Please joinclub: "+clubName);
    } 
}
