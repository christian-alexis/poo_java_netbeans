/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botones;

import eventos.ventana.EventosVentana;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.HeadlessException;

/**
 *
 * @author Leo
 */
public class Boton3 extends Frame {

    private String titulo;
    private int alto;
    private int ancho;
    private Button boton1;
    private Button boton2;
    private Button boton3;
    private Button boton4;

    public Boton3() throws HeadlessException {
    }

    public Boton3(String titulo, int alto, int ancho) throws HeadlessException {
        super (titulo);
        this.titulo = titulo;
        this.alto = alto;
        this.ancho = ancho;
        this.setSize(alto, ancho);
        boton1 = new Button("Presioname a mi y te dare DINERO");
        boton2 = new Button("Presioname a mi y te hare INTELIGENTE");
        boton3 = new Button("Presioname a mi y te dare FAMA");
        boton4 = new Button("Presioname a mi y te hare FELIZ");
        this.setLayout(new GridLayout(3,2));
        this.add(boton1,0);
        this.add(boton2,1);
        this.add(boton3,2);
        this.add(boton4,3);
        
        this.addWindowListener(new EventosVentana());
        

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

}
