/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 52551
 */
public class Progra {
    private String Nombre,ParadigaPrincipal,ParadigmaSecundario,AñoDePrimerVersion,PaisDeOrigen;

    public Progra() {
    }

    public Progra(String Nombre, String ParadigaPrincipal, String ParadigmaSecundario, String AñoDePrimerVersion, String PaisDeOrigen) {
        this.Nombre = Nombre;
        this.ParadigaPrincipal = ParadigaPrincipal;
        this.ParadigmaSecundario = ParadigmaSecundario;
        this.AñoDePrimerVersion = AñoDePrimerVersion;
        this.PaisDeOrigen = PaisDeOrigen;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getParadigaPrincipal() {
        return ParadigaPrincipal;
    }

    public void setParadigaPrincipal(String ParadigaPrincipal) {
        this.ParadigaPrincipal = ParadigaPrincipal;
    }

    public String getParadigmaSecundario() {
        return ParadigmaSecundario;
    }

    public void setParadigmaSecundario(String ParadigmaSecundario) {
        this.ParadigmaSecundario = ParadigmaSecundario;
    }

    public String getAñoDePrimerVersion() {
        return AñoDePrimerVersion;
    }

    public void setAñoDePrimerVersion(String AñoDePrimerVersion) {
        this.AñoDePrimerVersion = AñoDePrimerVersion;
    }

    public String getPaisDeOrigen() {
        return PaisDeOrigen;
    }

    public void setPaisDeOrigen(String PaisDeOrigen) {
        this.PaisDeOrigen = PaisDeOrigen;
    }

    @Override
    public String toString() {
        return "Progra{" + "Nombre=" + Nombre + ", ParadigaPrincipal=" + ParadigaPrincipal + ", ParadigmaSecundario=" + ParadigmaSecundario + ", A\u00f1oDePrimerVersion=" + AñoDePrimerVersion + ", PaisDeOrigen=" + PaisDeOrigen + '}';
    }
    


    
}
