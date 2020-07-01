/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Leo
 */
public class Buscaminas extends JFrame {

    public static final int REN = 20;
    public static final int COL = 20;

    private ArrayList<BotonBuscaMinas> cuadricula;

    public Buscaminas() throws HeadlessException {
        super("Buscaminas patito v 0.1.0");
        super.setSize(300, 300);
        //super.setLayout(new GridLayout(REN, COL));
        this.getContentPane().setLayout(new GridLayout(REN, COL));
        cuadricula = new ArrayList();
        int total = REN * COL;
        for (int i = 0; i < total; i++) {
            cuadricula.add(new BotonBuscaMinas(true));
            this.getContentPane().add(cuadricula.get(i), i);
            // aleatorios si el nuem es menor 2u5 o.5 
            double ran= Math.random();
            if(ran < 0.5){
                cuadricula.get(i).setMina(false);
            }
        }
        
        
        for (int i = 0; i < total; i++) {
           cuadricula.get(i).addMouseListener(new MouseAdapter() {
               @Override
               public void mouseClicked(MouseEvent e) {
                   //System.out.println("Fuente:"+e.getSource());
                   System.out.println(""+((BotonBuscaMinas)e.getSource()).isMina());
                   if(((BotonBuscaMinas)e.getSource()).isMina() == true){
                    ((BotonBuscaMinas)e.getSource()).setText("si");
                       JOptionPane.showMessageDialog(null, "Perdiste!!!", "Buscaminas 0.1.0", JOptionPane.ERROR_MESSAGE);
                   }else{
                    ((BotonBuscaMinas)e.getSource()).setText("no");   
                   }
               }
               
           });
        }

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

        });
    }
}


