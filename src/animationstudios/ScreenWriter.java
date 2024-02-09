/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animationstudios;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.concurrent.Semaphore;

/**
 *
 * @author davidmizrahi
 */
public class ScreenWriter extends Thread {
    
        
    private int salary = 20 ;
        
        
    private int swAmount;
        
        
    private Developers dev;
        
        
        
        
    public ScreenWriter(Developers dev) {
            
            
        this.dev = dev;
        
        this.swAmount = dev.getSwAmount();
            
        
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
            
            try{
                
                int dayDuration = dev.getDayDuration();
                
                Drive driveAccess = dev.getScreenWriterDrive();
                
                Semaphore s = dev.getScreenWriterSemaphore();
                
                
                
                
                
                
                
//                sleep(dayDuration * 4000 / swAmount);
                
                s.acquire();
                
                driveAccess.addPart(1);
                
                s.release();
                
                
                
                //ACCION LINKEADA CON LA INTERFAZ 
                
                
            } catch (InterruptedException ex) {
                
                    ex.printStackTrace();
            }
        }
        
  }
    
    
    
    
    

