/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animationstudios;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author davidmizrahi
 */
public class Assembler extends Thread{
    
    private Developers dev;
    
    private int assemblersAmount;
    
    private int dayDuration;
    
    private int salary = 50;
    
    private Semaphore screenWriterSemaphore;
    private Semaphore designerSemaphore;
    private Semaphore animatorSemaphore;
    private Semaphore actorSemaphore;
    private Semaphore plotTwistWriterSemaphore;
    private Semaphore assemblerSemaphore;
    private Semaphore directorSemaphore;
    
    
    private Drive screenWriterDrive;
    private Drive designerDrive;
    private Drive animatorDrive;
    private Drive actorDrive;
    private Drive plotTwistWriterDrive;
    private Drive assemblerDrive;
    private Drive directorDrive;
    
    //----------TEST REQUIREMENTS--------------
    
    private int swRequirements = 1;
    private int designRequirements = 1;
    private int animatorRequirements = 2;
    private int actorRequirements = 4;
    
    //----------TEST REQUIREMENTS--------------
    
    public Assembler(Developers dev){
        
        this.dev = dev;
        
        this.assemblersAmount = dev.getAssemblerAmount();
        
        this.dayDuration = dev.getDayDuration();
        
        this.screenWriterSemaphore = dev.getScreenWriterSemaphore();
        this.designerSemaphore = dev.getDesignerSemaphore();
        this.animatorSemaphore = dev.getAnimatorSemaphore();
        this.actorSemaphore = dev.getActorSemaphore();
        this.plotTwistWriterSemaphore = dev.getPlotTwistWriterSemaphore();
        this.assemblerSemaphore = dev.getAssemblerSemaphore();
        this.directorSemaphore = dev.getDirectorSemaphore();
        
        this.screenWriterDrive = dev.getScreenWriterDrive();
        this.designerDrive = dev.getDesignerDrive();
        this.animatorDrive = dev.getAnimatorDrive();
        this.actorDrive = dev.getActorDrive();
        this.plotTwistWriterDrive = dev.getPlotTwistWriterDrive();
        this.assemblerDrive = dev.getAssemblerDrive();
        this.directorDrive = dev.getDirectorDrive();
        
        
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
    
    
    public void assembleEpisode() throws InterruptedException{
        //FOR ASSEMBLING AN EPISODE FIRST WE CHECK IF AL THE REQUIREMENTS ARE MET, i.e THERE ARE ENOUGH PARTS ADDED ACCORDING TO EACH COMPANY
        screenWriterSemaphore.acquire();
        designerSemaphore.acquire();
        animatorSemaphore.acquire();
        actorSemaphore.acquire();
//        plotTwistWriterSemaphore.acquire();
        
        
        if(
                screenWriterDrive.getParts() >= swRequirements 
                && designerDrive.getParts() >= designRequirements 
                && animatorDrive.getParts() >= animatorRequirements 
                && actorDrive.getParts() >= actorRequirements
                
                )
        {
            assemblerSemaphore.acquire();
            
            assemblerDrive.addPart(1);
            
            assemblerSemaphore.release();
            screenWriterSemaphore.release();
            designerSemaphore.release();
            animatorSemaphore.release();
            actorSemaphore.release();
            
        }
       
        
    }
    @Override
    public void run(){
        try {
            
            sleep(dayDuration * 2000 / assemblersAmount);
            assembleEpisode();
        } catch (InterruptedException ex) {
            Logger.getLogger(Assembler.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
    
}
