
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leo
 */
public class Araña {
    private String nombre;
    private String alias;
    private String pais;
    private String poder;
    private String edad;

    public Araña() {
    }

    public Araña(String nombre, String alias, String pais, String poder, String edad) {
        this.nombre = nombre;
        this.alias = alias;
        this.pais = pais;
        this.poder = poder;
        this.edad = edad;
    }

    Araña(ArrayList<Araña> lista) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return "Ara\u00f1a{" + "nombre=" + nombre + ", alias=" + alias + ", pais=" + pais + ", poder=" + poder + ", edad=" + edad + '}';
    }
    
    
    
}
