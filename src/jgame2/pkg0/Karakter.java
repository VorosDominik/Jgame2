/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jgame2.pkg0;

/**
 *
 * @author Vörös
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Karakter {
    private static final Random RND = new Random();
    private int eletero, ugyesseg, szerencse;
    private ArrayList<Targy> felszerelesek;
    
    public Karakter() {
        this.eletero = this.kockadobas(2) + 12;
        this.ugyesseg = this.kockadobas() + 6;
        this.szerencse = this.kockadobas() + 6;
        this.felszerelesek = new ArrayList<>();
    }
    
    private int kockadobas() {
        return this.kockadobas(1);
    }
    
    private int kockadobas(int db) {
        int osszeg = 0;
        
        for (int i = 0; i < db; i++) {
            osszeg += this.RND.nextInt(1, 6 + 1);
            
        }
        return osszeg;
    }
    
    public void felvesz(Targy targy, int db) {
        for (int i = 0; i < db; i++) {
            this.felvesz(targy);
        }
    }
    
    public void felvesz(Targy targy) {
        this.felszerelesek.add(targy);
    }
    
    public void hasznal(String targyNev) {
        this.hasznal(targyNev, 1);
    }
    
    public void hasznal(String targyNev, int db) {
        this.hasznal(targyNev, db, true);
    }
    
    /**
     * 
     * @param targyNev elhasználandó tárgy neve
     * @param db elhasználandó tárgy darab száma
     * @param hasznalHaKevesebbVan elhasználja-e a megadott darab számú tárgyat, ha kevesebb van a játékosnál
     */
    public void hasznal(String targyNev, int db, boolean hasznalHaKevesebbVan) {
        ArrayList<Integer> targyIndexek = new ArrayList();
        
        for (int i = 0; i < this.felszerelesek.size() && (targyIndexek.size() < db); i++) {
            if (this.felszerelesek.get(i).getNev().equals(targyNev)) {
                targyIndexek.add(i);
            }
        }
        int talaltTargyDb = targyIndexek.size();
        
        if (talaltTargyDb > 0) {
            if (hasznalHaKevesebbVan || talaltTargyDb == db) {
                for (int index = targyIndexek.size(); index > 0; index--) {
                    this.felszerelesek.remove(index);
                }
                System.out.printf("%d db %s sikeresen felhasználva!\n", talaltTargyDb, targyNev);
            } else {
                System.out.printf("%s nem sikerült felhasználni! (%d/%d)\n", targyNev, db, talaltTargyDb);
            }
        } else {
            System.out.println("Nem található ilyen tárgy!");
        }
    }

    public int getEletero() {
        return eletero;
    }

    public int getUgyesseg() {
        return ugyesseg;
    }

    public int getSzerencse() {
        return szerencse;
    }

    @Override
    public String toString() {
        return "Karakter{" + "eletero=" + eletero + ", ugyesseg=" + ugyesseg + ", szerencse=" + szerencse + ", felszerelesek=" + felszerelesek + '}';
    }


    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.eletero;
        hash = 47 * hash + this.ugyesseg;
        hash = 47 * hash + this.szerencse;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Karakter other = (Karakter) obj;
        if (this.eletero != other.eletero) {
            return false;
        }
        if (this.ugyesseg != other.ugyesseg) {
            return false;
        }
        return this.szerencse == other.szerencse;
    }    
}
