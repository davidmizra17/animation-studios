/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animationstudios;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;

/**
 *
 * @author davidmizrahi
 */
public class PlotTwistWriter extends Thread{
 
    
    private int salary = 34;
    
    private int ptAmount;
    
    private Developers dev;
    
    
    public PlotTwistWriter(Developers dev){
        
        this.dev = dev;
        
        this.ptAmount = dev.getPtAmount();
    
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Developers getDev() {
        return dev;
    }

    public void setDev(Developers dev) {
        this.dev = dev;
    }
    
    @Override
    public void run(){
        
        while(true){
        try{
                int dayDuration = dev.getDayDuration();
                
                Drive driveAccess = dev.getPlotTwistWriterDrive();
                
                Semaphore s = dev.getPlotTwistWriterSemaphore();
                
                
                
                
                
                
                
                sleep(dayDuration * 2000 / ptAmount);
                
                s.acquire();
                
                driveAccess.addPart(1);
                
                s.release();
                
                
                
                //ACCION LINKEADA CON LA INTERFAZ 
                
                
            } catch (InterruptedException ex) {
                
                    ex.printStackTrace();
            }
    }
    }
    
    
    
}

    


    


    

