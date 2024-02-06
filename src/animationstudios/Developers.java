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
    
    private String type;
    
    //numero de trabajadores con carnet terminado en 6
    
    private static int n = 18;
    
    private int SalaryPerHour;
    
    private String name;
    
    private int driveCapacity;
    
    private static int dayDuration;
    
    private static Drive drive = new Drive(25);
    
    public Developers(String type, int SalaryPerHour, String name, int driveCapacity, int dayDuration){
        
        //NOTA: USANDO HERENCIA EL CAMPO "TYPE" NO ES NECESARIO
        this.type = type;
        // -------------------
        
        this.SalaryPerHour = SalaryPerHour;
        
        this.name = name;
        
        this.driveCapacity = driveCapacity;
        
        this.dayDuration = dayDuration;
        
        
    
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static int getN() {
        return n;
    }

    public static void setN(int n) {
        Developers.n = n;
    }

    public int getSalaryPerHour() {
        return SalaryPerHour;
    }

    public void setSalaryPerHour(int SalaryPerHour) {
        this.SalaryPerHour = SalaryPerHour;
    }

  public String getNombre(){
      return this.name;
    }
  
  public void setNombre(String name){
      this.name = name;
  }
    
  public Drive getDrive(){
      return drive;
  }
  
  public void setDrive(Drive drive){
      this.drive = drive;
  }
  
  
    
  
    
    public static class ScreenWriter extends Developers{
      
        private String guionGenerico;
        
        private int n_screenwriters = 1;
        
        //SEMAFORO DE PRUEBA
        private Semaphore s = new Semaphore(1);

        public ScreenWriter(String type, int SalaryPerHour, String name, int driveCapacity, int dayDuration) {
           
            super(type, SalaryPerHour = 20, name, driveCapacity, dayDuration);
            
            this.guionGenerico = "este es el guion generico para los screenwriters";
        }
        
        @Override
        public void run(){
            try{
                
                System.out.println("FUCK U NIGGA");
                
                sleep(2000);
                
                drive.addPart(guionGenerico, "ScreenWriter");
                
                
                
                //ACCION LINKEADA CON LA INTERFAZ 
                
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Developers.class.getName()).log(Level.SEVERE, null, ex);
                    ex.printStackTrace();
            }
        }
        
  }
  

    public static class Designer extends Developers{
      
      
    
            public Designer(String type, int SalaryPerHour, String name, int driveCapacity, int dayDuration) {
        
                super(type, SalaryPerHour = 26, name, driveCapacity, dayDuration);
    
            }
            
            public void test(){
                System.out.println("esto es una prueba");
            }
        }
  
        
    public class Animator extends Developers{
      
      
     

        public Animator(String type, int SalaryPerHour, String name, int driveCapacity, int dayDuration) {
           
            super(type, SalaryPerHour = 40, name, driveCapacity, dayDuration);
        
        }
        
    }
  
  
        
    public class Actors extends Developers{
      
      
        
        public Actors(String type, int SalaryPerHour, String name, int driveCapacity, int dayDuration) {
            
            super(type, SalaryPerHour = 16, name, driveCapacity, dayDuration);
        
        }
        
    }
  
  
    public class PlotTwistScreenWriter extends Developers{
      
           
        public PlotTwistScreenWriter(String type, int SalaryPerHour, String name, int driveCapacity, int dayDuration) {
            
            super(type, SalaryPerHour = 34, name, driveCapacity, dayDuration);
        
            
        }
        
    }
        
        

      
  }
        
    
    
    
    
    
    
    
    

