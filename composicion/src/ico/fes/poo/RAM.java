/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo;

/**
 *
 * @author Leo
 */
public class RAM {
    private int capcida;
    private String marca;
    private String modelo;

    public RAM() {
    }

    public RAM(int capcida, String marca, String modelo) {
        this.capcida = capcida;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getCapcida() {
        return capcida;
    }

    public void setCapcida(int capcida) {
        this.capcida = capcida;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void leer (int dir){
        System.out.println("leyendo la direccion" + dir);
    }
    
    public void escribir (String datos,int direccion){
        System.out.println("Ecribir los dotos:"+ datos+"En la direcion:"+ direccion);  
    }
 
}
