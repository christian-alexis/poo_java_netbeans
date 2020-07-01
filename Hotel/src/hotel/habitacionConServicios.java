/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

/**
 *
 * @author Leo
 */
public class habitacionConServicios   {
    private String Csencilla;
    private String Cdoble;
    private String Csuite;
    private String Cking;
    private String Cpresidencial;

    public habitacionConServicios() {
    }

    public habitacionConServicios(String Csencilla, String Cdoble, String Csuite, String Cking, String Cpresidencial) {
        this.Csencilla = Csencilla;
        this.Cdoble = Cdoble;
        this.Csuite = Csuite;
        this.Cking = Cking;
        this.Cpresidencial = Cpresidencial;
    }

    habitacionConServicios(String cama_matrimonial1600_la_noche) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    public String getCsencilla() {
        return Csencilla;
    }

    public void setCsencilla(String Csencilla) {
        this.Csencilla = Csencilla;
    }

    public String getCdoble() {
        return Cdoble;
    }

    public void setCdoble(String Cdoble) {
        this.Cdoble = Cdoble;
    }

    public String getCsuite() {
        return Csuite;
    }

    public void setCsuite(String Csuite) {
        this.Csuite = Csuite;
    }

    public String getCking() {
        return Cking;
    }

    public void setCking(String Cking) {
        this.Cking = Cking;
    }

    public String getCpresidencial() {
        return Cpresidencial;
    }

    public void setCpresidencial(String Cpresidencial) {
        this.Cpresidencial = Cpresidencial;
    }
            
    public void reservar (){
        System.out.println("esta habitacion esta reservada");
    }

    @Override
    public String toString() {
        String res= "la habitacion sencilla:"+this.Csencilla + " por noche";
        res = res +"\n la habitacion doble:"+this.Cdoble + " por noche";
        res = res + "\n una suite:"+this.Csuite + " por noche";
        res = res +"\n una habitacion king" + this.Cking + " por noche";
        res = res +"\n una habitacion presidencial" +this.Cpresidencial + " por noche";
       
        return res; 
     
    }
    
    
}
