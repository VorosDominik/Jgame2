/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jgame2.pkg0;

/**
 *
 * @author Vörös
 */
public class JGame20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Karakter k1 = new Karakter();
        
        
        k1.felvesz(new Targy("kard", "d leírás"), 2);
        k1.felvesz(new Targy("alma", "Leírás"), 2);
        k1.felvesz(new Targy("bakancs", "d leírás"), 2);
        k1.felvesz(new Targy("hegedü", "b leírás"));
 
        
        k1.hasznal("alma");
        k1.hasznal("bakancs", 1);
        k1.hasznal("alma", 5, false);
        k1.hasznal("hegedu", 5);
        
    }
    
}
