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
public class Director extends Thread {
    
    
    private int SalaryPerHour = 60;
    
    private int daysLeft;
    
    private int dayDuration;
    
    private ProjectManager pm;
    
    private Developers dev;
    
    
    public Director(ProjectManager pm, Developers dev){
        
        this.dev = dev;
        
        this.pm = pm;
        
        this.daysLeft = pm.getDaysLeft();
        
        this.dayDuration = dev.getDayDuration();
        
    }

    public int getSalaryPerHour() {
        return SalaryPerHour;
    }

    public void setSalaryPerHour(int SalaryPerHour) {
        this.SalaryPerHour = SalaryPerHour;
    }

    public int getDaysLeft() {
        return daysLeft;
    }

    public void setDaysLeft(int daysLeft) {
        this.daysLeft = daysLeft;
    }

    public ProjectManager getPm() {
        return pm;
    }

    public void setPm(ProjectManager pm) {
        this.pm = pm;
    }
    
    public void sendEpisode() throws InterruptedException{
        
        if(daysLeft == 0){
            
            sleep(dayDuration);
            
            dev.getAssemblerSemaphore().acquire();
            
            int episodesAdded = dev.getAssemblerDrive().getParts();
            
            int plotTwistEpisodesAdded = dev.getAssemblerDrive().getParts();
            
            int profit = (dev.getProfitPerRegularEpisode() * episodesAdded + dev.getProfitPerPlotTwistEpisode() * plotTwistEpisodesAdded);
            
            
            
        }
        
    }
    
    @Override
    public void run(){
        try {
            sendEpisode();
                    } catch (InterruptedException ex) {
            Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
   
    
}
