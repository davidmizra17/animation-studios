/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
    
    
    public Designer(int designerAmount){
        
        this.designerAmount = designerAmount;
    
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDesignerAmount() {
        return designerAmount;
    }

    public void setDesignerAmount(int designerAmount) {
        this.designerAmount = designerAmount;
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
                
                
                
                System.out.println("FUCK U NIGGA");
                
                
                
                sleep(dayDuration * 4000 / designerAmount);
                
                s.acquire();
                
                driveAccess.addPart();
                
                s.release();
                
                
                
                //ACCION LINKEADA CON LA INTERFAZ 
                
                
            } catch (InterruptedException ex) {
                
                    ex.printStackTrace();
            }
    }
    
    
    
}
