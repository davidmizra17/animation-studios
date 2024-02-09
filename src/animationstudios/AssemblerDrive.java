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
public class AssemblerDrive extends Drive{
    
    private int assemblers;
    
    public AssemblerDrive(int capacity){
        
        super(capacity);

    }
    
    public void addEpisode(int amount){
        
        int episodesAdded = amount;
        
        setParts(getParts() + episodesAdded);
    }
    
}
