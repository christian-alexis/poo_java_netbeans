/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botones;

import eventos.ventana.EventosVentana;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.LayoutManager;

/**
 *
 * @author Leo
 */
public class Boton4 extends Frame {

    private String titulo;
    private int alto;
    private int ancho;
    private Button bot0;
    private Button bot1;
    private Button bot2;
    private Button bot3;
    private Button bot4;
    private Button bot5;
    GridBagConstraints gbc = new GridBagConstraints();

    public Boton4() throws HeadlessException {
    }

    public Boton4(String titulo, int alto, int ancho) throws HeadlessException {
        super(titulo);
        this.titulo = titulo;
        this.alto = alto;
        this.ancho = ancho;
        this.setSize(alto, ancho);
        this.setLayout(new GridBagLayout());
        this.gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;

        bot0 = new Button("boton 0");
        this.add(bot0, gbc);

        bot1 = new Button("boton 1");
        this.add(bot1, gbc);

        bot2 = new Button("boton 2");
        this.add(bot2, gbc);

        this.gbc.gridwidth = GridBagConstraints.REMAINDER;
        bot3 = new Button("boton 3");

        this.add(bot3, gbc);

        this.gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridy = 1;
        gbc.gridwidth = 4;
        bot4 = new Button("boton 4");

        this.add(bot4, gbc);

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
