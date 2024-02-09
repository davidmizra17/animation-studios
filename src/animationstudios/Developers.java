/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    
    //DAYS LEFT TILL EPISODE RELEASE
    private int daysLeft;

//    PROFIT VARIABLES
    private int ProfitPerRegularEpisode;
    private int ProfitPerPlotTwistEpisode;
    
    
    
    
    
    
    //numero de trabajadores con carnet terminado en 6
    
    private int n = 18;
    
    private int dayDuration;
    
    private int swAmount;
    private int designerAmount;
    private int animatorAmount;
    private int actorAmount;
    private int ptAmount;
    private int assemblerAmount;
    
    //COMPANY NAME
//    private String companyName;
    
    
    
    public Developers(int daysLeft, int dayDuration, int swAmount, int animatorAmount, int designerAmount,int actorAmount, int ptAmount, int assemblerAmount){
        
        //NOTA: USANDO HERENCIA EL CAMPO "TYPE" NO ES NECESARIO
        
        // -------------------
        
        
        this.dayDuration = dayDuration;
        
        this.daysLeft = daysLeft;
        
        
        
        
        
//        NUMBER OF WORKERS INITIALIZATION

        this.swAmount = swAmount;
        this.designerAmount = designerAmount;
        this.animatorAmount = animatorAmount;
        this.actorAmount = actorAmount;
        this.ptAmount = ptAmount;
        this.assemblerAmount = assemblerAmount;
        
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

    public int getDaysLeft() {
        return daysLeft;
    }

    public void setDaysLeft(int daysLeft) {
        this.daysLeft = daysLeft;
    }
    
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

    public int getSwAmount() {
        return swAmount;
    }

    public void setSwAmount(int swAmount) {
        this.swAmount = swAmount;
    }

    public int getDesignerAmount() {
        return designerAmount;
    }

    public void setDesignerAmount(int designerAmount) {
        this.designerAmount = designerAmount;
    }

    public int getAnimatorAmount() {
        return animatorAmount;
    }

    public void setAnimatorAmount(int animatorAmount) {
        this.animatorAmount = animatorAmount;
    }

    public int getActorAmount() {
        return actorAmount;
    }

    public void setActorAmount(int actorAmount) {
        this.actorAmount = actorAmount;
    }

    public int getPtAmount() {
        return ptAmount;
    }

    public void setPtAmount(int ptAmount) {
        this.ptAmount = ptAmount;
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

    public int getAssemblerAmount() {
        return assemblerAmount;
    }

    public void setAssemblerAmount(int assemblerAmount) {
        this.assemblerAmount = assemblerAmount;
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


    public int getDayDuration() {
        return dayDuration;
    }

    public void setDayDuration(int dayDuration) {
        this.dayDuration = dayDuration;
    }

    public int getProfitPerRegularEpisode() {
        return ProfitPerRegularEpisode;
    }

    public void setProfitPerRegularEpisode(int ProfitPerRegularEpisode) {
        this.ProfitPerRegularEpisode = ProfitPerRegularEpisode;
    }

    public int getProfitPerPlotTwistEpisode() {
        return ProfitPerPlotTwistEpisode;
    }

    public void setProfitPerPlotTwistEpisode(int ProfitPerPlotTwistEpisode) {
        this.ProfitPerPlotTwistEpisode = ProfitPerPlotTwistEpisode;
    }
    
    
}
    
  
  
    
  
    
    