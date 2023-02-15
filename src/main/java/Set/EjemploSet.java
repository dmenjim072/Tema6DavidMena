/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author david
 */
public class EjemploSet {
    
    public static void main(String[] args) {
        
        //EJEMPLO SET BORRANDO UN ELEMENTO DE SU LISTA(PARA QUE NO SE REPITA)
        
        
        //Creamos un set de enteros
        Set<Integer> conjunto = new HashSet<>();
        
        //Le añadimos numeros
        conjunto.add(10);
        conjunto.add(20);
        conjunto.add(30);
        
        //Mostramos el set
        for (Integer numerico : conjunto) {
            System.out.println("Elemento " + numerico);
            
            //No puedo borrar de un conjunto de datos si se esta recorriendo el mismo
//            if(numerico == 20){
//                conjunto.remove(20);
//            }
        
        }

        //Borramos el elemento 20
        Iterator<Integer> it = conjunto.iterator();
        while(it.hasNext()){
            
            Integer numerico = it.next();
            if(numerico == 20){
                it.remove();
            }
            
        }
        
        System.out.println();
        
        //Mostramos el set una vez borrado el 20
        for (Integer numerico : conjunto) {
            
            System.out.println("Elemento " + numerico);
                               
        }
        
    }
    
}
