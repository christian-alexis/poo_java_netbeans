/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.intro;

/**
 *
 * @author Leo
 */
import herencia.comics.SuperHeroe;

public class HerenciaIntro {
    
    public static void main(String[] args) {
        SuperHeroe flash=new SuperHeroe();
        flash.setAlias("flash");
        flash.setCurp("34546547");
        flash.setFechadenacimiento(21);
        flash.setPoder("super velocidad y comer mucho");
        flash.setSexo("hombre");
        flash.setNombre("Barry alen");
        System.out.println(flash);
        flash.salvarVidas();
        
        SuperHeroe spiderman= new SuperHeroe ("sentido aracnido","Ameazing Spider-Man",
                "Piter parker",21,"wdfiheri","hombre");
    
    
}
}