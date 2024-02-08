/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animationstudios;


import animationstudios.Drive;

/**
 *
 * @author davidmizrahi
 */
public class AnimationStudios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        public ScreenWriter(String type, int SalaryPerHour, String name, int driveCapacity, int dayDuration) {
//        Developers developersInstance = new Developers("sw", 20, "juan", 25, 2000);
//           Drive drive = new Drive(60);
//        Developers.ScreenWriter sw = new Developers.ScreenWriter("sw", 20, "juan", 25, 2000);
//        
//        Developers.Designer dis = new Developers.Designer("sw", 20, "juan", 25, 2000);
//        
//        
//        
//        sw.start();
//        
//       
//        
//        System.out.println(sw.getNombre());
//        System.out.println("Animation Studios");

        ScreenWriter sw = new ScreenWriter(12);
        
        Assembler as = new Assembler();
        sw.start();
        
        as.assembleEpisode();
        
        System.out.println("NO CREO QUE LLEGUE HASTA ACA");
    }
    
}
