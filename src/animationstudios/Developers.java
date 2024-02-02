/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animationstudios;

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
    
    public Developers(String type, int SalaryPerHour, String name){
        this.type = type;
        this.SalaryPerHour = SalaryPerHour;
        this.name = name;
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
    
    
    
    
    
    
    
    
    
    
    
}
