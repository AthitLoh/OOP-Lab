/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.oop;

/**
 *
 * @author coc
 */
public class Q2 {
    private int channel;
    private int brightness;
    private String name;
    
    public Q2(){
        channel = 1;
        brightness = 50;
        name = "";
    }
    public Q2(int c){
        channel = c;
        brightness = 50;
        name = "";
    }
    
    // getter
    public int getChannel() {
        return channel;
    }
    // setter
    public void setChannel(int c) {
        if(c != 1) {
        } else {
            channel = c;
        }
    }
    
    public int getAdaptiveBrightness(){
        return brightness;
    }
    
    public int extBrightness(int ext){
        
    }
    // getter : It's read-only
    public String getName() {
        return name;
    }
}
