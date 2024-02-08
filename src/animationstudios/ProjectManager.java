/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animationstudios;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author davidmizrahi
 */
public class ProjectManager extends Thread {
    
    private int dayDuration;
    
    private int daysLeft;
    
    private int hourCounter;
    
    private boolean isWatchingAnime;
    
    private Developers dev;
    
    
    
    
    
    public ProjectManager(Developers dev){
       
        this.dev = dev;
        
        this.hourCounter = 0;
        
        this.dayDuration = dev.getDayDuration();
        
        this.daysLeft = dev.getDaysLeft();
        
        this.isWatchingAnime = false;
    }

    public int getDayDuration() {
        return dayDuration;
    }

    public void setDayDuration(int dayDuration) {
        this.dayDuration = dayDuration;
    }

    public int getDaysLeft() {
        return daysLeft;
    }

    public void setDaysLeft(int daysLeft) {
        this.daysLeft = daysLeft;
    }

    public int getHourCounter() {
        return hourCounter;
    }

    public void setHourCounter(int hourCounter) {
        this.hourCounter = hourCounter;
    }

    public boolean isIsWatchingAnime() {
        return isWatchingAnime;
    }

    public void setIsWatchingAnime(boolean isWatchingAnime) {
        this.isWatchingAnime = isWatchingAnime;
    }

    public Developers getDev() {
        return dev;
    }

    public void setDev(Developers dev) {
        this.dev = dev;
    }
    
    public void PMFunc() throws InterruptedException{
    
        int halfAnHour = (dayDuration / 48);
        
        //VARIABLE TO KEEP TRACK OF THE PASSING OF EACH HOUR UPDATED EVERY HALF AN HOUR TO BE LATER SUBSTRACTED FROM ITS SALARY
        int timeSpent = 0;
        
        while(hourCounter < 16){
            
            //CURRENTLY WATCHING ANIME
            setIsWatchingAnime(true);
            
            sleep(halfAnHour);
            
            timeSpent += halfAnHour;
            
            //CURRENTLY WORKING
            setIsWatchingAnime(false);
            
            sleep(halfAnHour);
            
           
            ++hourCounter;
            
        
        }
        
        //CURRENTLY WORKING
        setIsWatchingAnime(false);
        
        
       --daysLeft;
        
        //AMOUNT 
    }
    
    
    @Override
    public void run(){
        
        try {
            
            PMFunc();
            
        } catch (InterruptedException ex) {
            
            Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    
    
}
