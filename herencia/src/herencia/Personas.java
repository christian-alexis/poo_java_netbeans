/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import herencia.comics.SuperHeroe;

/**
 *
 * @author Leo
 */




public class Personas {

  
    public static void main(String[] args) {
        Alumno alumno = new Alumno ();
        
       
        alumno.setCarrera("ico");
        alumno.setNumerodecuenta(23443543);
        alumno.setCurp("dakjhebj3i7");
        alumno.setFechadenacimiento(1604200);
        alumno.setSexo("hombre");
        alumno.setPromedio(9.2f);
        System.out.println(alumno);
        alumno.aplicado();
        alumno.camina();
        alumno.existe();
        alumno.feliz();
        System.out.println("\n");
        
        Trabajador trabajador = new Trabajador ();
        trabajador.setNombre("diego");
        trabajador.setCurp("fkrk43729");
        trabajador.setAnodeingreso(2000);
        trabajador.setPuesto("gerente");
        trabajador.setRfc("dn37h78c");
        trabajador.setSexo("hombre");
        trabajador.setFechadenacimiento(12031995);
        System.out.println(trabajador);
        trabajador.cansancio();
        trabajador.duerme();
        trabajador.puntual();
        trabajador.trabajador();
       
        
    Alumno alumno1= new Alumno(133454, 3465467f, "ico" + new Persona("alvaro", 325, "fnregknreg", "wfdlnreg"));
        System.out.println(alumno1);
          
       
        
        
       
        
                
                
        
        
    }

 
    
    
}

