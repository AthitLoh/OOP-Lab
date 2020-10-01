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
public class Player {
    protected String name;
    protected int jerseyNumber;
    protected int minutesPlayed;
    
    public Player(String n, int j) {
        name = n;
        jerseyNumber = j;
        minutesPlayed = 0;
    }
    
    public void print() {
        System.out.println(name+": "+jerseyNumber);
    }
    public void playGame() {
        minutesPlayed = minutesPlayed + 90;
    }
    public int getMinutesPlayed() {
        return minutesPlayed;
    }
   
}



