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
public class Animator extends Thread{
    
    private int salary = 40;
    
    private int animatorAmount;
    
    private Developers dev;
    
    
    public Animator(Developers dev){
        
        this.dev = dev;
        
        this.animatorAmount = dev.getAnimatorAmount();
    
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
    
    public int payAnimator(){
        int hour = dev.getDayDuration() / 24;
        
        return hour * salary;
        
    }
    
    @Override
    public void run(){
        
        while(true){
        
        try{
                int dayDuration = dev.getDayDuration();
                
                Drive driveAccess = dev.getAnimatorDrive();
                
                Semaphore s = dev.getAnimatorSemaphore();
                
                
                
                
                
                
                
                sleep(dayDuration);
                
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

    

