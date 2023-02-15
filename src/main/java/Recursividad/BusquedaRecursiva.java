/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursividad;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author david
 */
public class BusquedaRecursiva {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> lista = new ArrayList<>();
        
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        
        System.out.println(busqueda(lista, 7, 2));
    }
    
    //Metodo para buscar en una lista de forma recursiva un elemento
    private static int busqueda(List<Integer> lista, int n, int posicion){
        
        boolean encontrado = n ==lista.get(posicion);
        
        if(encontrado){
            return posicion;
        }else if(lista.size() -1 == posicion && (encontrado)){
            return -1;
        }else{
            return busqueda(lista, n, ++posicion);
        }
        
    }
    
}
