/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jgame2.pkg0;

/**
 *
 * @author voros.dominik
 */
public class Észak extends Helyszin implements MásikIrány{

    public Észak() {
    }

    @Override
    public String leirás() {
        return "Na tesom végy kabátot ez már a jeges észak";
    }

    @Override
    public Helyszin egyikirány() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Helyszin másikirány() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String egyikirányFelirat() {
        return "É1";
    }

    @Override
    public String másikirányFelirat() {
        return "É2";
    }
    
}
