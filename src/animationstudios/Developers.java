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
public class Developers extends Thread{
    
  
    
    
    //SEMAPHORES
    private Semaphore screenWriterSemaphore;
    private Semaphore designerSemaphore;
    private Semaphore animatorSemaphore;
    private Semaphore actorSemaphore;
    private Semaphore plotTwistWriterSemaphore;
    private Semaphore assemblerSemaphore;
    private Semaphore directorSemaphore;
    
    //DRIVES FOR EACH GROUP OF WORKERS
    private Drive screenWriterDrive;
    private Drive designerDrive;
    private Drive animatorDrive;
    private Drive actorDrive;
    private Drive plotTwistWriterDrive;
    private Drive assemblerDrive;
    private Drive directorDrive;

    public Semaphore getAssemblerSemaphore() {
        return assemblerSemaphore;
    }

    public void setAssemblerSemaphore(Semaphore assemblerSemaphore) {
        this.assemblerSemaphore = assemblerSemaphore;
    }

    public Semaphore getDirectorSemaphore() {
        return directorSemaphore;
    }

    public void setDirectorSemaphore(Semaphore directorSemaphore) {
        this.directorSemaphore = directorSemaphore;
    }

    public Drive getAssemblerDrive() {
        return assemblerDrive;
    }

    public void setAssemblerDrive(Drive assemblerDrive) {
        this.assemblerDrive = assemblerDrive;
    }

    public Drive getDirectorDrive() {
        return directorDrive;
    }

    public void setDirectorDrive(Drive directorDrive) {
        this.directorDrive = directorDrive;
    }
    
    
    //numero de trabajadores con carnet terminado en 6
    
    private int n = 18;
    
    private int SalaryPerHour;
    
    private int driveCapacity;
    
    private int dayDuration;
    
    
    
    public Developers(int SalaryPerHour, int driveCapacity, int dayDuration){
        
        //NOTA: USANDO HERENCIA EL CAMPO "TYPE" NO ES NECESARIO
        
        // -------------------
        
        this.SalaryPerHour = SalaryPerHour;
        
        this.driveCapacity = driveCapacity;
        
        this.dayDuration = dayDuration;
        
        //SEMAPHORES INITIALIZATION
        
        this.screenWriterSemaphore = new Semaphore(1);
        
        this.designerSemaphore = new Semaphore(1);
        
        this.animatorSemaphore = new Semaphore(1);
        
        this.actorSemaphore = new Semaphore(1);
        
        this.plotTwistWriterSemaphore = new Semaphore(1);
        
//        DRIVES INTIALIZATION

        this.screenWriterDrive = new Drive(25);
        
        this.designerDrive = new Drive(20);
        
        this.animatorDrive = new Drive(55);
        
        this.actorDrive = new Drive(35);
        
        this.plotTwistWriterDrive = new Drive(10);
        
    
    }

    public Semaphore getScreenWriterSemaphore() {
        return screenWriterSemaphore;
    }

    public void setScreenWriterSemaphore(Semaphore screenWriterSemaphore) {
        this.screenWriterSemaphore = screenWriterSemaphore;
    }

    public Semaphore getDesignerSemaphore() {
        return designerSemaphore;
    }

    public void setDesignerSemaphore(Semaphore designerSemaphore) {
        this.designerSemaphore = designerSemaphore;
    }

    public Semaphore getAnimatorSemaphore() {
        return animatorSemaphore;
    }

    public void setAnimatorSemaphore(Semaphore animatorSemaphore) {
        this.animatorSemaphore = animatorSemaphore;
    }

    public Semaphore getActorSemaphore() {
        return actorSemaphore;
    }

    public void setActorSemaphore(Semaphore actorSemaphore) {
        this.actorSemaphore = actorSemaphore;
    }

    public Semaphore getPlotTwistWriterSemaphore() {
        return plotTwistWriterSemaphore;
    }

    public void setPlotTwistWriterSemaphore(Semaphore plotTwistWriterSemaphore) {
        this.plotTwistWriterSemaphore = plotTwistWriterSemaphore;
    }

    public Drive getScreenWriterDrive() {
        return screenWriterDrive;
    }

    public void setScreenWriterDrive(Drive screenWriterDrive) {
        this.screenWriterDrive = screenWriterDrive;
    }

    public Drive getDesignerDrive() {
        return designerDrive;
    }

    public void setDesignerDrive(Drive designerDrive) {
        this.designerDrive = designerDrive;
    }

    public Drive getAnimatorDrive() {
        return animatorDrive;
    }

    public void setAnimatorDrive(Drive animatorDrive) {
        this.animatorDrive = animatorDrive;
    }

    public Drive getActorDrive() {
        return actorDrive;
    }

    public void setActorDrive(Drive actorDrive) {
        this.actorDrive = actorDrive;
    }

    public Drive getPlotTwistWriterDrive() {
        return plotTwistWriterDrive;
    }

    public void setPlotTwistWriterDrive(Drive plotTwistWriterDrive) {
        this.plotTwistWriterDrive = plotTwistWriterDrive;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getSalaryPerHour() {
        return SalaryPerHour;
    }

    public void setSalaryPerHour(int SalaryPerHour) {
        this.SalaryPerHour = SalaryPerHour;
    }

    public int getDriveCapacity() {
        return driveCapacity;
    }

    public void setDriveCapacity(int driveCapacity) {
        this.driveCapacity = driveCapacity;
    }

    public int getDayDuration() {
        return dayDuration;
    }

    public void setDayDuration(int dayDuration) {
        this.dayDuration = dayDuration;
    }
}
    
  
  
    
  
    
    