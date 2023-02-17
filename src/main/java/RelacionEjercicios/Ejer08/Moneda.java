/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RelacionEjercicios.Ejer08;

import java.util.Random;

/**
 *
 * @author david
 */
public class Moneda extends Azar {

    @Override
    public int lanzar() {
        return new Random().nextInt(1, posibilidades+1);
    }
    
    public Moneda() {
        super(2);
    }
    
//    public int lanzar(){
//        
//        Random r = new Random();
//        int randomMoneda = r.nextInt(1, 2+1);
//        
//        return randomMoneda;
//    }
//    

    
}
