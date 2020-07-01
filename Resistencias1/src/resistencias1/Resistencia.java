/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resistencias1;

/**
 *
 * @author 52551
 */
public class Resistencia {
    String Tipos;
    float ValorNominal;
    String Tolerancia;
    float Potencia;
    String CodigoDeColores;

    public Resistencia() {
    }

    public Resistencia(String Tipos, float ValorNominal, String Tolerancia, float Potencia, String CodigoDeColores) {
        this.Tipos = Tipos;
        this.ValorNominal = ValorNominal;
        this.Tolerancia = Tolerancia;
        this.Potencia = Potencia;
        this.CodigoDeColores = CodigoDeColores;
    }

    public String getTipos() {
        return Tipos;
    }

    public void setTipos(String Tipos) {
        this.Tipos = Tipos;
    }

    public float getValorNominal() {
        return ValorNominal;
    }

    public void setValorNominal(float ValorNominal) {
        this.ValorNominal = ValorNominal;
    }

    public String getTolerancia() {
        return Tolerancia;
    }

    public void setTolerancia(String Tolerancia) {
        this.Tolerancia = Tolerancia;
    }

    public float getPotencia() {
        return Potencia;
    }

    public void setPotencia(float Potencia) {
        this.Potencia = Potencia;
    }

    public String getCodigoDeColores() {
        return CodigoDeColores;
    }

    public void setCodigoDeColores(String CodigoDeColores) {
        this.CodigoDeColores = CodigoDeColores;
    }

    @Override
    public String toString() {
        return "Resistencia{" + "Tipos=" + Tipos + ", ValorNominal=" + ValorNominal + ", Tolerancia=" + Tolerancia + ", Potencia=" + Potencia + ", CodigoDeColores=" + CodigoDeColores + '}';
    }
    
    
}
