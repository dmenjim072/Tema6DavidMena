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
public class Dado extends Azar {

    public Dado() {
        super(6);
    }

    @Override
    public int lanzar() {
        return new Random().nextInt(1, posibilidades+1);
    }
    
    public void metodoDado(){
        
    }
    
    
//    public int lanzar(){
//        
//        Random r = new Random();
//        int randomDado = r.nextInt(1, 6+1);
//        
//        return randomDado;
//    }
    
}
