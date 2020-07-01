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
public class Pruebas {

    public static void main(String[] args) {
        Guitarra g = new Guitarra(6, 1967, "Gibson");
        System.out.println("Guitarra\n");
        System.out.println("el año que fue construida es:" + g.getAnioConstruccion());
        System.out.println("La marca es:" + g.getMarca());
        System.out.println("tiene: " + g.getNumeroCuerdas() + " cuerdas");
        System.out.println("Se afina:");
        g.afinar();
        System.out.println("Suena:");
        g.tocar();
        System.out.println("");
        
        System.out.println("Piano\n");
        Piano p = new Piano(280, 2002, "Bechstein-Zimmermann");
        System.out.println("el año que fue construido es:" + p.getAnioConstruccion());
        System.out.println("La marca es:" + p.getMarca());
        System.out.println("tiene: " + p.getNumeroCuerdas() + " cuerdas");
        System.out.println("Se afina:");
        p.afinar();
        System.out.println("Suena:");
        p.tocar();
        System.out.println("");
        
        System.out.println("Flauta\n");
        Flauta f=new Flauta(8, 2015, "Yamaha");
        System.out.println("el año que fue construido es:" + f.getAnioConstruccion());
        System.out.println("La marca es:" + f.getMarca());
        System.out.println("tiene: " + f.getnumeroHoyos()+ " hoyos");
        System.out.println("Se afina:");
        f.afinar();
        System.out.println("Suena:");
        f.tocar();
        System.out.println("");

    }
}
