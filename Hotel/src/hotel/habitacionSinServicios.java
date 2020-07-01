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
public class habitacionSinServicios  {
    private String sencilla;
    private String doble;
    private String suite;
    private String king;
    private String presidencial;

    public habitacionSinServicios() {
    }

    public habitacionSinServicios(String sencilla, String doble, String suite, String king, String presidencial) {
        this.sencilla = sencilla;
        this.doble = doble;
        this.suite = suite;
        this.king = king;
        this.presidencial = presidencial;
    }

    public String getPresidencial() {
        return presidencial;
    }

    public void setPresidencial(String presidencial) {
        this.presidencial = presidencial;
    }

    public String getSencilla() {
        return sencilla;
    }

    public void setSencilla(String sencilla) {
        this.sencilla = sencilla;
    }

    public String getDoble() {
        return doble;
    }

    public void setDoble(String doble) {
        this.doble = doble;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public String getKing() {
        return king;
    }

    public void setKing(String king) {
        this.king = king;
    }
   
    public void reservacion (){
        System.out.println("esta habitacion esta reservada");
        
    }

    @Override
    public String toString() {
           
       String res= "la habitacion sencilla:"+this.sencilla + " por noche";
        res = res +"\n la habitacion doble:"+this.doble + " por noche";
        res = res + "\n una suite:"+this.suite + " por noche";
        res = res +"\n una habitacion king" + this.king + " por noche";
        res = res +"\n una habitacion presidencial" +this.presidencial + " por noche";
       
        return res;
    }
    
    
}
