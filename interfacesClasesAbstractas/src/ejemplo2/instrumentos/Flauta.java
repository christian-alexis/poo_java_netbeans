/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2.instrumentos;

/**
 *
 * @author Leo
 */
public class Flauta implements Instrumento {
      private int tipoInstrumento;

    public Flauta() {
    }

    public Flauta(int tipoInstrumento) {
        this.tipoInstrumento = tipoInstrumento;
    }

    public int getTipoInstrumento() {
        return Instrumento.FLAUTA;
    }

    public void setTipoInstrumento(int tipoInstrumento) {
        this.tipoInstrumento = tipoInstrumento;
    }
      


    @Override
    public boolean afinar() {
          boolean afinado=false;
     System.out.println("elegir la madera adecuada");
     System.out.println("cortar en las medidas exatas");
     System.out.println("limpiar bien madera");
     afinado= true;
     return afinado;
          
            
    }

    @Override
    public String emitirSonido() {
        String sonido="";
        sonido= "tuuu tuuuu la flauta";
                
        return sonido;
    }
     
    @Override
    public void limpiar() { 
        System.out.println("lipiar hollitos");
        System.out.println("Limpiar cuerpo");
        System.out.println("Limpiar boquilla");
    }

   
        

        
    
}
