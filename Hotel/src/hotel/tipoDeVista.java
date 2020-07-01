/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

/**
 *
 * @author Leo
 */
public class tipoDeVista  {
     private String mar;
     private String golf;

    public tipoDeVista() {
    }

    public tipoDeVista(String mar, String golf) {
        this.mar = mar;
        this.golf = golf;
    }

    public String getGolf() {
        return golf;
    }

    public void setGolf(String golf) {
        this.golf = golf;
    }

    public String getMar() {
        return mar;
    }

    public void setMar(String mar) {
        this.mar = mar;
    }
    
    public void visita (){
        System.out.println("usted visitara");
       
    }

    @Override
    public String toString() {
        String res="vista al mar" + this.mar +"\n";
        res=res + "vista al campo de golf"+this.golf +"\n";
        return res;
       
    }
    
}
