/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animationstudios;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author davidmizrahi
 */
public class ProjectManager extends Thread {
    
    private int dayDuration;
    
    private int daysLeft;
    
    private int timeSpent;
    
    private int salary;
    
    private int hourCounter;
    
    private boolean isWatchingAnime;
    
    private int faults;
    
    private Developers dev;
    
    
    
    
    
    
    public ProjectManager(Developers dev){
       
        this.dev = dev;
        
        this.hourCounter = 0;
        
        this.timeSpent = 0;
        
        this.dayDuration = dev.getDayDuration();
        
        this.daysLeft = dev.getDaysLeft();
        
        this.faults = 0;
        
        this.salary = 40;
        
        this.isWatchingAnime = false;
    }

    public int getDayDuration() {
        return dayDuration;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
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

    public boolean getIsWatchingAnime() {
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

    public int getFaults() {
        return faults;
    }

    public void setFaults(int faults) {
        this.faults = faults;
    }

    public int getTimeSpent() {
        return timeSpent;
    }

    public void setTimeSpent(int timeSpent) {
        this.timeSpent = timeSpent;
    }
    
    
    
    
    
    public void PMFunc() throws InterruptedException{
    
        int halfAnHour = (dayDuration / 48);
        
        int fullHour = (dayDuration / 24);
        
        //VARIABLE TO KEEP TRACK OF THE PASSING OF EACH HOUR UPDATED EVERY HALF AN HOUR TO BE LATER SUBSTRACTED FROM ITS SALARY
         timeSpent = 0;
        
        while(hourCounter < 16){
            
            //CURRENTLY WATCHING ANIME
            setIsWatchingAnime(true);
            
            sleep(halfAnHour);
            
            timeSpent += halfAnHour;
            
            //CURRENTLY WORKING
            setIsWatchingAnime(false);
            
            sleep(halfAnHour);
            
            timeSpent += halfAnHour;
           
            ++hourCounter;
            
        
        }
        
        //CURRENTLY WORKING
        setIsWatchingAnime(false);
        
        timeSpent+= 8;
        
       --daysLeft;
        
        //AMOUNT 
    }
    
    public int payPM(){
        return timeSpent * salary;
    }
    
    
    @Override
    public void run(){
        
        while(true){
        
        try {
            
            PMFunc();
            payPM();
            
        } catch (InterruptedException ex) {
            
            Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    }
    
    
    
}
