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
public class Persona {
    private String nombre;
    private int edad;
    private String curp;
    private String sexo;

    public Persona() {
    }

    public Persona(String nombre, int edad, String curp, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.curp = curp;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre ) {
        this.nombre = "alvaro";
    }

    public int getedad() {
        return edad;
    }

    public void setFechadenacimiento(int edad) {
        this.edad = edad;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
        public void vivir (){
        System.out.println("esta viva");
    }
    public void morir (){
        System.out.println("esta muerta");
    }
       @Override
    public String toString() {
        String res="Nombre:"+this.nombre +"\n";
        res=res + "curp:"+this.curp +"\n";
        res = res +"sexo:"+this.sexo+" \n";
        res=res + "edad:" + this.edad + "\n";
        
        

        return res;
    }
}






