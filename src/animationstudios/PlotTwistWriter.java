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
public class PlotTwistWriter extends Thread{
 
    
    private int salary = 40;
    
    private int ptAmount;
    
    private Developers dev;
    
    
    public PlotTwistWriter(int ptAmount){
        
        this.ptAmount = ptAmount;
    
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getPlotTwistAmount() {
        return ptAmount;
    }

    public void setPlotTwistAmount(int ptAmount) {
        this.ptAmount = ptAmount;
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
                
                Drive driveAccess = dev.getPlotTwistWriterDrive();
                
                Semaphore s = dev.getPlotTwistWriterSemaphore();
                
                
                
                System.out.println("FUCK U NIGGA");
                
                
                
                sleep(dayDuration * 4000 / ptAmount);
                
                s.acquire();
                
                driveAccess.addPart();
                
                s.release();
                
                
                
                //ACCION LINKEADA CON LA INTERFAZ 
                
                
            } catch (InterruptedException ex) {
                
                    ex.printStackTrace();
            }
    }
    
    
    
}

    


    


    

