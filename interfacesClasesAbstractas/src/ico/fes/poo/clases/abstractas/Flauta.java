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
public class Flauta extends Instrumentos{
     int numeroHoyos;

    public Flauta() {
    }

    public Flauta(int numeroHoyos) {
        this.numeroHoyos = numeroHoyos;
    }

   public Flauta(int numeroHoyos, int anioConstruccion, String marca) {
        super(anioConstruccion, marca);
        this.numeroHoyos = numeroHoyos;
    }

    public int getnumeroHoyos() {
        return numeroHoyos;
    }

    public void setNumeroCuerdas(int numeroCuerdas) {
        this.numeroHoyos = numeroHoyos;
    }

    @Override
    public void afinar() {
        System.out.println("cortar modera a cierto tamaño");
        System.out.println("de pendiend de la madera sera la fininacion");
        System.out.println("hacr hoyos a cierta distancia");
        System.out.println("comprobar que al soplar de los tonos correctos");
    }

    @Override
    public void tocar() {
        System.out.println("firu... firu.... la flauta!");
    }    
}
    

