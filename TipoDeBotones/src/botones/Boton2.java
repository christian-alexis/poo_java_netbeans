/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botones;

import eventos.ventana.EventosVentana;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.HeadlessException;

/**
 *
 * @author Leo
 */
public class Boton2 extends Frame {

    private String titulo;
    private int alto;
    private int ancho;
    private Button boton1;
    private Button boton2;
    private Button boton3;
    private Button boton4;

    public Boton2() throws HeadlessException {
    }

    public Boton2(String titulo, int alto, int ancho) throws HeadlessException {
        super(titulo);
        this.titulo = titulo;
        this.alto = alto;
        this.ancho = ancho;
        this.setSize(alto, ancho);
        boton1 = new Button("agua");
        boton2 = new Button("viento");
        boton3 = new Button("fuego");
        boton4 = new Button("aire");
        this.setLayout(new BorderLayout());
        this.add("North", boton1);
        this.add("South", boton2);
        this.add("West", boton3);
        this.add("East", boton4);

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
