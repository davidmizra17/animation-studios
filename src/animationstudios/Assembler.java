/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animationstudios;

/**
 *
 * @author davidmizrahi
 */
public class Assembler extends Thread{
    
    int salary = 50;
    
    public Developers dev;

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
    
    
    public void assembleEpisode(){
        //FOR ASSEMBLING AN EPISODE FIRST WE CHECK IF AL THE REQUIREMENTS ARE MET, i.e THERE ARE ENOUGH PARTS ADDED ACCORDING TO EACH COMPANY
        int screenwriterparts = dev.getScreenWriterDrive().getParts();
        System.out.println("number of parts added by the screenwriter team: " + screenwriterparts);;
        
    }
    @Override
    public void run(){
        
        
        
    }
    
    
    
}
