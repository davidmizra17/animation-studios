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
    
    public Drive(int capacidad){
        this.animations=0;
        this.capacidad = capacidad;
    }
    
    public void addPart(int type){
        if (type == 0){
            this.animations += 1;
            System.out.println("animaciones disponibles:" + this.animations);
        
        }
    }
}
