/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jgame2.pkg0;

/**
 *
 * @author voros.dominik
 */
public class Jobra extends Helyszin implements MásikIrány{

    public Jobra() {
    }

    @Override
    public String leirás() {
        return "Eza az ugynevezett jobra";
    }

    @Override
    public Helyszin egyikirány() {
       Helyszin irány=new Nyugat();
        return irány;}

    @Override
    public Helyszin másikirány() {
       Helyszin irány=new Kelet();
        return irány;}

    @Override
    public String egyikirányFelirat() {
        return "Nyugat";
    }

    @Override
    public String másikirányFelirat() {
        return "Kelet";
    }
    
}
