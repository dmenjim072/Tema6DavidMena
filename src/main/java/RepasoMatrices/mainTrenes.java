/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RepasoMatrices;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author david
 */
public class mainTrenes {
    
     public static void main(String[] args) {

        int[][] matriz = {{2, 3, 4, 5}, {6, 7, 8, 9},
        {1, 4, 5, 7}, {9, 7, 8, 6}};

        int identificador = 0;

        int numPasajeros = 0;

        int numVagones = 0;

        Map<Integer, Trenes> t1 = new HashMap<>();

        for (int i = 0; i < matriz.length; i++) {
            numPasajeros = 0;
            numVagones = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == 0) {
                    identificador = matriz[i][j];
                } else {
                    if (matriz[i][j] > 0) {
                        numPasajeros = numPasajeros + matriz[i][j];
                        numVagones++;
                    }
                }
            }
            
            Trenes tren = new Trenes(identificador, numVagones, numPasajeros);
            t1.put(identificador, tren);
        }
        
        Collection mostrar = t1.values();
        mostrar.forEach(System.out::println);
    }
    
}
