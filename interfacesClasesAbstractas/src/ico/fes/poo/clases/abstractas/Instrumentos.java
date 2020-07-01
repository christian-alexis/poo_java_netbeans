/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.clases.abstractas;

/**
 *
 * @author Leo
 */
public  abstract class Instrumentos {
    private int anioConstruccion;
    private String marca;

    public Instrumentos() {
    }

    public Instrumentos(int anioConstruccion, String marca) {
        this.anioConstruccion = anioConstruccion;
        this.marca = marca;
    }

    public int getAnioConstruccion() {
        return anioConstruccion;
    }

    public void setAnioConstruccion(int anioConstruccion) {
        this.anioConstruccion = anioConstruccion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void obtenerTipoDeinstrumento(){
        System.out.println("Instrumento ...");
    }
    
    public abstract void  tocar();
    public abstract void  afinar();
    
    
}
