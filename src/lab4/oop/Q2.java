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
        this(1);
        
    }
    public Q2(int channel){
        this.channel = channel;
        this.brightness = 50;
        this.name = "";
    }
    
    // getter
    public int getChannel() {
        return this.channel;
    }
    // setter
    public void setChannel(int channel) {
        if(channel == this.channel-1 || channel == this.channel+1) {
            this.channel = channel;
        } 
    }
    
    public int getAdaptiveBrightness(){
        return this.brightness;
    }
    
    public int  getAdaptiveBrightness(int ext){
        return (this.brightness+ext)/2;
    }
    // getter : It's read-only
    public String getName() {
        return this.name;
    }
}
