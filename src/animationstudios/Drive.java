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
    
    public int parts;
    
    public int capacity;
    
    
    public Drive(int capacity){
        
        this.parts = 0;
        
        this.capacity = capacity;
        
        
        
        
    }

    public int getParts() {
        return parts;
    }

    public void setParts(int parts) {
        this.parts = parts;
    }
    
    public void addPart(int amount){
        
            int partsAdded = amount;
            
            if(getParts() + partsAdded >= capacity){
                
                setParts(capacity);
            
            }
            
            else{
                
                setParts(getParts() + partsAdded);
            }
            
            
            System.out.println("ha subido una parte");
            capacity--;
            
            
            
        
        
    }
}
