/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package timestamp;

/**
 *
 * @author kpapa01
 */
public class TimeStamp {

    int hrs, mins, secs;
    TimeStamp(){
        java.util.Calendar now = java.util.Calendar.getInstance();
        hrs = now.get(java.util.Calendar.HOUR_OF_DAY);
        mins = now.get(java.util.Calendar.MINUTE);
        secs = now.get(java.util.Calendar.SECOND);        
    }
    public static void main(String[] args) {
        
    }
    
}
