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
    
    public int capacity;
    
    
    public Drive(int capacity){
        
        this.animations=0;
        
        this.capacity = capacity;
        
        
        
        
    }
    
    public void addPart(){
        
     
            this.animations += 1;
            
//            almacenamientoPartes[arrayIndex] = part;
            
            
            
            System.out.println("ha subido una parte");
            capacity--;
            
            
            
        
        
    }
}
