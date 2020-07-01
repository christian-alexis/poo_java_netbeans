/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.Dinamos;

import hotel.habitacionConServicios;
import hotel.habitacionSinServicios;
import hotel.horarios;
import hotel.tipoDeVista;

/**
 *
 * @author Leo
 */
public class HotelDinamos {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
habitacionConServicios HCS = new habitacionConServicios ();
        
HCS.setCsencilla("(cama matrimonial) $2,200.00");
HCS.setCdoble("(dos camas matrimoniales)$3,650.00");
HCS.setCsuite("(mini bar,jacuzzi y cama King size) $5,950.00");
HCS.setCking("(sala,mini bar,alberca,cama king size)$7,850.00");
HCS.setCpresidencial("(resibidor,sala,bar,alberca,dos camas king size)$9,950.00");

habitacionSinServicios HSS = new habitacionSinServicios ();

HSS.setSencilla("(cama matrimonial)$1,600.00");
HSS.setDoble("(dos camas matrimoniales)$2,650.00");
HSS.setSuite("(mini bar,jacuzzi, cama king size)$4,890.00");
HSS.setKing("(sala,mini bar,alberca, camas king size)$6,250.00");
HSS.setPresidencial("(recibidor,sala,bar,alberca,dos camas king size)$8,100.00" );

horarios H= new horarios ();
H.setEntrada("3:00 pm");
H.setSalida("12:00 pm");

tipoDeVista t= new tipoDeVista ();
t.setGolf(" tine un cargo extra de $200.00 por habitacion");
t.setMar(" tine un cargo extra de $350.00 por habitacion");






        System.out.println("BIENBENIDOS A EL HOTEL DIAMOD INN \n");
        System.out.println("\nLA RENTA DE HABITACIONES CON TODOS LOS SERVICIOS INCLUIDOS SON:\n "
                + "(servicio a la habitacion,acceso al restaurante-bar,a los conciertos y espectaculos dentro del hotel,pulsera para barra libre 24 hrs) \n");
        System.out.println(HCS);
        System.out.println("\nLA RENTA DE HABITACIONES SIN LOS SERVICIOS INCLUIDOS SON:\n");
        System.out.println(HSS);
        System.out.println("\nHorarios:\n");
        System.out.println(H);
        System.out.println("\nTIPO DE VISTA\n");
        System.out.println(t);
        

}

    private static tipoDeVista tipoDeVista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}     

