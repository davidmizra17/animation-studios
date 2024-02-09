/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animationstudios;

import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author davidmizrahi
 */
public class Director extends Thread {
    
    
    private int SalaryPerHour = 60;
    
    private int daysLeft;
    
    private int dayDuration;
    
    private int timeSpent;
    
    private ProjectManager pm;
    
    private Developers dev;
    
    private JTextField daysEnteredByUser;
    
    
    public Director(ProjectManager pm, Developers dev){
        
        this.dev = dev;
        
        this.timeSpent = 0;
        
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

    public int getDayDuration() {
        return dayDuration;
    }

    public void setDayDuration(int dayDuration) {
        this.dayDuration = dayDuration;
    }

    public int getTimeSpent() {
        return timeSpent;
    }

    public void setTimeSpent(int timeSpent) {
        this.timeSpent = timeSpent;
    }

    public Developers getDev() {
        return dev;
    }

    public void setDev(Developers dev) {
        this.dev = dev;
    }
    
    
    public void sendEpisode() throws InterruptedException{
        
        if(daysLeft == 0){
            
            sleep(dayDuration);
            
            dev.getAssemblerSemaphore().acquire();
            
            int episodesAdded = dev.getAssemblerDrive().getParts();
            
            
            
            int plotTwistEpisodesAdded = dev.getAssemblerDrive().getParts();
            
            int profit = (dev.getProfitPerRegularEpisode() * episodesAdded + dev.getProfitPerPlotTwistEpisode() * plotTwistEpisodesAdded);
            
            
            //PARA VOLVER A SETEAR LOS DIAS SE LE PUEDE PASAR EL VALOR 
//            QUE INGRESO EL USUARIO ANTES DE 
//            CORRER LA SIMULACION Y ESO LO HARIAMOS CON UN JTEXT 
//              FIELD COMO PARAMETRO Y QUE SE LLAME A ESTA CLASE DESDE LA INTERFAZ


//            dev.setDaysLeft(0);


            
            
            
        }else{
            
            
            
            Random random = new Random();
            
            int n = dayDuration/35;
            int halfAnHourDirector = dayDuration/n;
            int randomHour = random.nextInt(24);
            
            if(0 < randomHour && randomHour <=16){
                
                
                //CURRENTLY CHECKING ON PM FOR THE NEXT 35 MINUTES
                sleep(halfAnHourDirector);
                
                if(pm.getIsWatchingAnime() == true){
                    
                    
                    System.out.println("PM CAUGHT WATCHING ANIME");
                    pm.setFaults(pm.getFaults() + 1);
                    
                    
                    
                    
                }
            }
            
            
        }
        
    }
    
    @Override
    public void run(){
        
        while(true){
        try {
            sendEpisode();
                    } catch (InterruptedException ex) {
            Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    }
    
    
   
    
}
