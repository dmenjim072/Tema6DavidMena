/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanaAbstract;

import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author david
 */
public class test {
    
    public static void main(String[] args) {
        
       //Creamos ventanas
       Ventana v1 = new vAbatible(90, true);
       Ventana v2 = new vCorredera(50, true);
       
       Set<Ventana> conjuntoVentanas = new HashSet<>();//Para crear un conjunto(lista ordenada) de ventanas
       
       //Añadimos ventanas a la lista       
       conjuntoVentanas.add(v2);
       conjuntoVentanas.add(v1);
       
       //Bucle foreach declarando Ventana v con el metodo abrir       
       for(Ventana v : conjuntoVentanas){
           v.abrir(100);
       }
       
    }
    
}
