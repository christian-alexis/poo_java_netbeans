/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 52551
 */
public class Pati {
    String Marca,Color,TamañoDeBota,TipoDeRueda,Protectores,Chasis;
    float Precio;

    public Pati() {
    }

    public Pati(String Marca, String Color, String TamañoDeBota, String TipoDeRueda, String Protectores, String Chasis, float Precio) {
        this.Marca = Marca;
        this.Color = Color;
        this.TamañoDeBota = TamañoDeBota;
        this.TipoDeRueda = TipoDeRueda;
        this.Protectores = Protectores;
        this.Chasis = Chasis;
        this.Precio = Precio;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getTamañoDeBota() {
        return TamañoDeBota;
    }

    public void setTamañoDeBota(String TamañoDeBota) {
        this.TamañoDeBota = TamañoDeBota;
    }

    public String getTipoDeRueda() {
        return TipoDeRueda;
    }

    public void setTipoDeRueda(String TipoDeRueda) {
        this.TipoDeRueda = TipoDeRueda;
    }

    public String getProtectores() {
        return Protectores;
    }

    public void setProtectores(String Protectores) {
        this.Protectores = Protectores;
    }

    public String getChasis() {
        return Chasis;
    }

    public void setChasis(String Chasis) {
        this.Chasis = Chasis;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "Pati{" + "Marca=" + Marca + ", Color=" + Color + ", Tama\u00f1oDeBota=" + TamañoDeBota + ", TipoDeRueda=" + TipoDeRueda + ", Protectores=" + Protectores + ", Chasis=" + Chasis + ", Precio=" + Precio + '}';
    }
    
}
