/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RelacionEjercicios.Ejer08;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author david
 */
public class EjemploAzar {
    
    public static void main(String[] args) {
        
        List<Azar> objetosAzar = new ArrayList<>();
        
        objetosAzar.add(new Moneda()); //Conversion implicita
        objetosAzar.add(new Dado()); //Conversion implicita
        
        for (Azar a : objetosAzar) {
            System.out.println("Lanzamiento " + a.lanzar());
            
            //Variable A eres un dado??
            if(a instanceof Dado){
                ((Dado) a).metodoDado(); //Conversion explicita
            }
        }
        
    }
    
}
