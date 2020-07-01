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
public class horarios  {
    private String entrada;
    private String salida;
    

    public horarios() {
    }

    public horarios( String entrada, String salida) {
        this.entrada = entrada;
        this.salida = salida;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }
    public void entrar (){
        System.out.println("la entrada es apartir de las 3:00 pm");
    }
    public void salida (){
        System.out.println("la salida es apartir de las 12:00 pm");
        
    }

    @Override
    public String toString() {
       String res="la estrada es:" + this.entrada +"\n";
        res=res + "la salida es:"+this.salida +"\n";
        
    
        return res;
        
       
    }
    
 
    
}
