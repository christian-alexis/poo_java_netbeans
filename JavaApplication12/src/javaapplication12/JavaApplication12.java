/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.util.ArrayList;
import java.util.Iterator;
import lista.Empleados;


/**
 *
 * @author Leo
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList lista= new ArrayList();
        Empleados e1= new Empleados("jose Garcia Perez", "sistemas", 670, 30, 5);
        Empleados e2= new Empleados("Diana Herrera Perez ", "recursos humanos", 450, 25, 0);
        Empleados e3= new Empleados("Jessica juarez Dias", "ventas", 400, 28, 0);
        Empleados e4= new Empleados("Pedro Paz Orozco", "ventas", 410, 30, 0);
        Empleados e5= new Empleados("Jose Marcel Perez", "sistemas", 680, 29, 6);
        Empleados e6= new Empleados("Jesus Diaz Garcia", "recursos humanos", 455, 30, 0);
        Empleados e7= new Empleados("Pedro Xotla Ramirez", "sistemas", 675, 27, 0);
        Empleados e8= new Empleados("Javiaer Medina Blanco", "ventas", 400, 30, 4);
        Empleados e9= new Empleados("Elizabeth Villa Sosa", "sistemas", 670, 30, 3);
                

        
        lista.add(e1);
        lista.add(e2);
        lista.add(e3);
        lista.add(e4);
        lista.add(e5);
        lista.add(e6);
        lista.add(e7);
        lista.add(e8);
        lista.add(e9);
        
        Iterator iter= lista.iterator();
        while (iter.hasNext()) {
            Empleados e= (Empleados)iter.next();
           int x= 30*e.getSueldo();
           System.out.println( "nombre:"+ e.getNombre() + "     sueldo mensual: $" + x);
           
           
         }
        System.out.println("\n");
         Iterator ite= lista.iterator();
        while (ite.hasNext()) {
            Empleados e= (Empleados)ite.next();
            int y=85*e.getHoras();
           System.out.println("nombre :"+e.getNombre()+ "     Monto total de horas extras: $" + y) ;
        }
        
           
        System.out.println("\n");
            int z= 80*e1.getSueldo()+85*e1.getHoras()+80*e2.getSueldo()+85*e2.getHoras()+80*e3.getSueldo()+85*e3.getHoras()
                    +80*e4.getSueldo()+85*e4.getHoras()+80*e5.getSueldo()+85*e5.getHoras()+80*e6.getSueldo()+85*e6.getHoras()
                    +80*e7.getSueldo()+85*e7.getHoras()+80*e8.getSueldo()+85*e8.getHoras()+ 80*e9.getSueldo()+85*e9.getHoras();
            System.out.println("El sueldo total de los trabajadores (incluyendo horas extra) es: $"+z);
            
         
        System.out.println("\n");
         Iterator iterad= lista.iterator();
        while (iterad.hasNext()) {
            Empleados e= (Empleados)iterad.next();
            System.out.println(e.getNombre() +" trabajo al mes: "+ e.getDias()+"  dias ");
           
            
        } 
         System.out.println("El empleado que trabajo menos diaz al mes es: "+ e2.getNombre());
         System.out.println("\n");
         Iterator iterador= lista.iterator();
        while (iterador.hasNext()) {
            Empleados e= (Empleados)iterador.next();
            System.out.println(e.getNombre()+":"+e.getHoras()+"hrs extra");
            
            
            
        }
        System.out.println("El empleado con mas horas extra es: "+ e5.getNombre());
    }
   
        
}
