/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui;

import javax.swing.JButton;

/**
 *
 * @author Leo
 */
public class BotonBuscaMinas extends JButton{
    private boolean mina;

    public BotonBuscaMinas() {
    }

    public BotonBuscaMinas(boolean mina) {
        this.mina = mina;
    }

    public boolean isMina() {
        return mina;
    }

    public void setMina(boolean mina) {
        this.mina = mina;
    }
    
    
}
