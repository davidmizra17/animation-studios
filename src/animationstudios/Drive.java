/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animationstudios;

/**
 *
 * @author davidmizrahi
 */
public class Drive {
    
    public int animations;
    
    public int capacidad;
    
    
    
    //PRUEBA DE ALMACENAMIENTO
    public String[] almacenamientoPartes;
    
    public int arrayIndex;
    
    public Drive(int capacidad){
        
        this.animations=0;
        
        this.capacidad = capacidad;
        
        this.almacenamientoPartes = new String[10];
        
        this.arrayIndex = 0;
    }
    
    public void addPart(String part, String name){
        
     
            this.animations += 1;
            
            almacenamientoPartes[arrayIndex] = part;
            
            
            
            System.out.println(name + " ha subido una parte");
            capacidad--;
            arrayIndex++;
            
            
        
        
    }
}
