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
public class Bolsas {
    private String color;
    private String tamaño;
    private String material;
    private String marca;
    private int numcompar;
    private float precio;
    private String aza;

    public Bolsas() {
    }

    public Bolsas(String color, String modelo, String material, String marca, int numcompar, float precio, String aza) {
        this.color = color;
        this.tamaño= modelo;
        this.material = material;
        this.marca = marca;
        this.numcompar = numcompar;
        this.precio = precio;
        this.aza = aza;
    }

    public String getAza() {
        return aza;
    }

    public void setAza(String aza) {
        this.aza = aza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return tamaño;
    }

    public void setModelo(String modelo) {
        this.tamaño = modelo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumcompar() {
        return numcompar;
    }

    public void setNumcompar(int numcompar) {
        this.numcompar = numcompar;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Bolsas{" + "color=" + color + ", modelo=" + tamaño + ", material=" + material + ", marca=" + marca + ", numcompar=" + numcompar + ", precio=" + precio + ", aza=" + aza + '}';
    }

   
            
    
}
