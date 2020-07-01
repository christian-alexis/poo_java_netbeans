/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

/**
 *
 * @author Leo
 */
public class Empleados {
    private String nombre;
    private String departamento;
    private int sueldo;
    private int dias;
    private int horas;

    public Empleados() {
    }

    public Empleados(String nombre, String departamento, int sueldo, int dias, int horas) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.sueldo = sueldo;
        this.dias = dias;
        this.horas = horas;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
    
    @Override
    public String toString() {
        return "nombre:" + nombre + "  departamento: " + departamento+ "   sueldo diario: $" + sueldo + 
                "  dias trabajados:" + dias +  "   horas extra:" + horas ;
        
    }
    
            
    
    
}
