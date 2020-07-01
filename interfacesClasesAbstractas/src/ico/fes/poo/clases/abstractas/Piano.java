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
public class Piano extends Instrumentos{
    private int numeroCuerdas;

    public Piano() {
    }

    public Piano(int numeroCuerdas) {
        this.numeroCuerdas = numeroCuerdas;
    }

    public Piano(int numeroCuerdas, int anioConstruccion, String marca) {
        super(anioConstruccion, marca);
        this.numeroCuerdas = numeroCuerdas;
    }

    public int getNumeroCuerdas() {
        return numeroCuerdas;
    }

    public void setNumeroCuerdas(int numeroCuerdas) {
        this.numeroCuerdas = numeroCuerdas;
    }

    @Override
    public void afinar() {
        System.out.println("abrir el cajon");
        System.out.println("Tocando cuerda");
        System.out.println("Ajustar hasta que suene en el tono correcto");
        System.out.println("Repetir operacion en todas las cuerdas con su respectivo tono");
    }

    @Override
    public void tocar() {
        System.out.println("turu.... turu... El piano !!!");
    }    
}
    

