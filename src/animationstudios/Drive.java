/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

