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
public class Piano implements Instrumento {
    private int tipoIntrumento;

    public Piano() {
    }

    public Piano(int tipoIntrumento) {
        this.tipoIntrumento = tipoIntrumento;
    }

    public int getTipoIntrumento() {
        return Instrumento.PIANO;
    }

    public void setTipoIntrumento(int tipoIntrumento) {
        this.tipoIntrumento = tipoIntrumento;
    }
    

    @Override
    public boolean afinar() {
        boolean afinado=false;
        System.out.println("se abre el cajon para jalar cuerdas");
        System.out.println("se jalan cuerdas ");
        System.out.println("se prueba cada cuerda con cada tono musixal");
     afinado=true;
     return afinado;
    }

    @Override
    public String emitirSonido() {
         String sonido="";
        sonido= "turu turu el piano";
                
        return sonido;
    }

    @Override
    public void limpiar() {
         System.out.println("Limpiando teclas");
        System.out.println("Limpiando cuerpo");
        System.out.println("Limpiando pedales");
    }
    
    
}
