/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tb;

import java.time.LocalDate;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author User
 */
public class Person {
    
    private SimpleStringProperty nm, km,kamar,tl;
    private LocalDate ci,co;
    

    public Person(String nm, String km,String kamar,String tl, LocalDate ci, LocalDate co) {
        this.nm = new SimpleStringProperty(nm);
        this.km = new SimpleStringProperty(km);
        this.kamar = new SimpleStringProperty(kamar);
        this.tl = new SimpleStringProperty(tl);
        this.ci = ci;
        this.co = co;
        
    }
    
    
   /* public Person(String nm, String km, String kamar, LocalDate co, LocalDate ci) {
        this.nm = new SimpleStringProperty(nm);
        this.km = new SimpleStringProperty(km);
        this.kamar = new SimpleStringProperty(kamar);
        this.tl = new SimpleStringProperty(tl);
        
                
        this.co = co;
        this.ci =ci;
        
    }*/
    
    

    
    
    public String getNama() {
        return nm.get();
    }

    public void setNama(String nm) {
        this.nm = new SimpleStringProperty(nm);
    }

    public String getLamaMenginap() {
        return km.get();
    }

    public void setLamaMenginap(String km) {
        this.km = new SimpleStringProperty(km);
    }
    
    public void setJenisKamar(String kamar) {
        this.kamar = new SimpleStringProperty(kamar);
    }
    public void setTotal(String tl) {
        this.tl = new SimpleStringProperty(tl);
    }
    
    
    

    public LocalDate getCheckIn() {
        return ci;
    }
    
    
    /*public int getAge()
    {
        return Period.between(ci, LocalDate.now()).getYears();
    }*/

    public void setCheckIn(LocalDate ci) {
        this.ci = ci;
    }
    
    public LocalDate getCheckOut(){
        return co;
    }
    
    public void setCheckOut(LocalDate co){
        LocalDate co1 = this.co;
    }
    
    public String toString()
    {
        return String.format("%s %s", nm, km, kamar, tl);
    }
}
    /*private final SimpleStringProperty nm= new SimpleStringProperty("");
     private final SimpleStringProperty kamar = new SimpleStringProperty("");       
     private final SimpleStringProperty km = new SimpleStringProperty("");
     private final SimpleStringProperty tl = new SimpleStringProperty("");
     
    private LocalDate ci,co;
    
    
    
public Person(String nm, String kamar, String km, String tl, LocalDate ci, LocalDate co){
        String setNm = nm;
        String setKamar = kamar;
        String setKm = km;
        String setTl=  tl;
        LocalDate setCi = ci;
        LocalDate setCo = co;
        
        
        
    /*this.nm = new SimpleStringProperty (nm);
    this.kamar = new SimpleStringProperty(kamar);
    this.km = new SimpleStringProperty(km);
    this.tl = new SimpleStringProperty(tl);   */


    /*Person(String text, String text0, String text1, String text2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Person(String text, String text0, String text1, String text2, LocalDate value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Person(String string, String string0, String string1, String string2, String string3, String string4) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    

