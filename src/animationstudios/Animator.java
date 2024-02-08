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
public class Animator extends Thread{
    
    private int salary = 40;
    
    private int animatorAmount;
    
    private Developers dev;
    
    
    public Animator(int designerAmount){
        
        this.animatorAmount = designerAmount;
    
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnimatorAmount() {
        return animatorAmount;
    }

    public void setAnimatorAmount(int AnimatorAmoun) {
        this.animatorAmount = AnimatorAmoun;
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
                
                Drive driveAccess = dev.getAnimatorDrive();
                
                Semaphore s = dev.getAnimatorSemaphore();
                
                
                
                System.out.println("FUCK U NIGGA");
                
                
                
                sleep(dayDuration * 4000 / animatorAmount);
                
                s.acquire();
                
                driveAccess.addPart();
                
                s.release();
                
                
                
                //ACCION LINKEADA CON LA INTERFAZ 
                
                
            } catch (InterruptedException ex) {
                
                    ex.printStackTrace();
            }
    }
    
    
    
}

    

