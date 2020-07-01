/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;


import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Leo
 */
public class Ventana extends JFrame{
    private String titulo;
    private int ancho;
    private int largo;
    private JButton boton;
    private JLabel etiqueta;
    private JTextField caja;
    private JLabel etiqueta2;

    public Ventana() throws HeadlessException {
    }

    public Ventana(String titulo, int ancho, int largo) throws HeadlessException {
        this.setTitle(titulo);
        this.titulo = titulo;
        this.ancho = ancho;
        this.largo = largo;
        this.setSize(ancho, largo);
        this.setLocationRelativeTo(this);
        this.getContentPane().setBackground(Color.BLACK);
        
        boton = new JButton();
        boton.setText("Saludar");
        this.setLayout (null);
        boton.setBounds(400, 250, 100, 30);
        this.add(boton);
        
        etiqueta = new JLabel();
        etiqueta.setText("Ingresa tu nombre:");
        this.setLayout (null);
        etiqueta.setForeground(Color.GREEN);
        etiqueta.setBounds(250, 200, 150, 30);
        this.add(etiqueta);
         
        etiqueta2 = new JLabel(new ImageIcon("foto.jpg"));
        etiqueta2.setBounds(50, 50, 170,290) ;
        this.add(etiqueta2);
        
        
        caja = new JTextField();
        caja.setBounds(360,200, 200, 30);
        this.add(caja);
        
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Bienvenido a la NASA" + "\n" + caja.getText());
                
            }
        });
        this.addWindowListener(new Evento());
        
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    
    
}
