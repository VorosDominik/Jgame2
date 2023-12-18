/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jgame2.pkg0;

/**
 *
 * @author voros.dominik
 */
public class Start extends Helyszin {

    @Override
    public String leirás() {
       
        return "EZ a Start Haladj tovább....";
       
    }

    @Override
    public Helyszin egyikirány() {
        Helyszin kezdes=new Kezdes();
        return kezdes;
   
    }

    @Override
    public String egyikirányFelirat() {
        return "tovább";
    }

    @Override
    public Helyszin másikirány() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String másikirányFelirat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
