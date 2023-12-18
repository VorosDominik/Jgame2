/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jgame2.pkg0;

/**
 *
 * @author voros.dominik
 */
public class Balra extends Helyszin implements MásikIrány{

    @Override
    public String leirás() {
        
        return "ez az ugynevezett Ballra";
        
    }

    @Override
    public Helyszin egyikirány() {
       Helyszin irány=new Észak();
        return irány;
    }

    @Override
    public Helyszin másikirány() {
      Helyszin irány=new Dél();
        return irány;
    }

    @Override
    public String egyikirányFelirat() {
        return "Észak";
    }

    @Override
    public String másikirányFelirat() {
       return "Dél";}
    
}
