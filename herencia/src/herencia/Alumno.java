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
public class Alumno extends Persona{
    private int numerodecuenta;
    private float promedio;
    private String carrera;
    private Persona persona;
    

    public Alumno() {
    }

    public Alumno(int numerodecuenta, float promedio, String carrera) {
       this.numerodecuenta = numerodecuenta;
        this.promedio = promedio;
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getNumerodecuenta() {
        return numerodecuenta;
    }

    public void setNumerodecuenta(int numerodecuenta) {
        this.numerodecuenta = numerodecuenta;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
    public boolean aplicado() {
        System.out.println(this.getNombre()+ " es aplicado");
        return true;
       
    }
    public boolean feliz(){
        System.out.println( this.getNombre()+ " es feliz: ");    
        return false;
    }
    public void existe (){
        System.out.println(this.getNombre()+" existe");
        
    }
    public void camina (){
        System.out.println(this.getNombre()+" va caminando");
    }

       @Override
    public String toString() {
        String res="carrera:"+this.carrera +"\n";
        res=res + "Numero de cuenta :"+this.numerodecuenta +"\n";
        res = res +"promedio:"+this.promedio+" \n";
         
       

        return res;
    }

    void feliz(boolean b) {
        throw new UnsupportedOperationException("flase"); //To change body of generated methods, choose Tools | Templates.
    }
          
}
