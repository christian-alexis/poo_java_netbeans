/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Leo
 */
public class Trabajador extends Persona {
    private String rfc;
    private String puesto;
    private int anodeingreso; 

    public Trabajador() {
    }

    public Trabajador(String rfc, String puesto, int anodeingreso) {
        this.rfc = rfc;
        this.puesto = puesto;
        this.anodeingreso = anodeingreso;
    }

    public int getAnodeingreso() {
        return anodeingreso;
    }

    public void setAnodeingreso(int anodeingreso) {
        this.anodeingreso = anodeingreso;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public boolean trabajador (){
        System.out.println(this.getNombre() + " es trabajador");
        return true;
    }
    public boolean puntual (){
        System.out.println(this.getNombre()+ " llega temprano");
        return false;    
    }
    
    public void duerme (){
        System.out.println(this.getNombre() + " esta durmiendo");
    }
    public void cansancio (){
        System.out.println(this.getNombre() +" esta cansado");
    }
     @Override
    public String toString() {
        String res="rfc:"+this.rfc +"\n";
        res=res + "puesto :"+this.puesto +"\n";
        res = res +"año de ingreso: "+this.anodeingreso +" \n";
        res = res + "nombre:"+this.getNombre()+"\n";
        res = res + "sexo:"+this.getSexo()+"\n" ;
        res = res + "curp:"+this.getCurp()+"\n";
       

        return res;
    }

   
}
