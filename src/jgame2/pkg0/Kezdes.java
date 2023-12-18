/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jgame2.pkg0;

/**
 *
 * @author voros.dominik
 */
public class Kezdes extends Helyszin implements MásikIrány{

    @Override
    public String leirás() {
     
    
        return "ez a kezdes , Ballra mész vagy jobra?";
     
    
    }

    @Override
    public Helyszin egyikirány() {
          Helyszin balra=new Balra();
        return balra;
    }

    @Override
    public String egyikirányFelirat() {
    return "ballra";
    }

    @Override
    public Helyszin másikirány() {
      Helyszin jobra=new Jobra();
        return jobra;
    
    }

    @Override
    public String másikirányFelirat() {
    return "Jobra";
    }
    
}
