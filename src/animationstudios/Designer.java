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
public class Designer extends Thread{
    
    
    private int salary = 26;
    
    private int designerAmount;
    
    private Developers dev;
    
    
    public Designer(Developers dev){
        
        this.dev = dev;
        
        this.designerAmount = dev.getDesignerAmount();
    
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
                
                Drive driveAccess = dev.getDesignerDrive();
                
                Semaphore s = dev.getDesignerSemaphore();
                
                
                
                
                
                
                
                sleep(dayDuration * 4000 / designerAmount);
                
                s.acquire();
                
                driveAccess.addPart(1);
                
                s.release();
                
                
                
                //ACCION LINKEADA CON LA INTERFAZ 
                
                
            } catch (InterruptedException ex) {
                
                    ex.printStackTrace();
            }
    }
    
    
    
}
