/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testtv;

/**
 *
 * @author kpapa01
 */
public class TestTV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

class TV{
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;
    
    public TV(){}
    public void turnOn(){ on = true;}
    public void turnOff(){ on = false;}
    
    public void setChannel(int newChannel){
        if(on && newChannel >= 1 && newChannel <= 120)
            channel = newChannel;
    }
    public void setVolume(int newVolumeLevel){
        if(on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
            volumeLevel = newVolumeLevel;
    }
    public void channelUp(){
        if(on && channel <=120)
            channel++;
    }
    public void channelDown(){
        if(on && channel > 1)
            channel--;
    }
}
