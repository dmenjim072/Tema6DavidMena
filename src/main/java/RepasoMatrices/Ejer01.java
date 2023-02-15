/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RepasoMatrices;

import java.util.Random;

/**
 *
 * @author david
 */
public class Ejer01 {
    
    public static void main(String[] args) {
        
        //Declaramos las variables y generamos el objeto random
        int n = 4;
        int numMax = n * n;
        int [][] matriz = new int[n][n];
        
        Random r = new Random();
        int numRandom = 0;
        
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
                //Hacemos un bucle do para que se repita hasta que el metodo llamado sea true(numero no sea igual)
//                do{
                    
                    //A cada espacio de la matriz le asignamos un numero aleatorio
                    numRandom = r.nextInt(numMax) + 1;
                    
                    
                    if(!comprobarRepetido(matriz, numRandom)){
                        matriz [i][j] = numRandom;
                    }
                    
//                }while(comprobarRepetido(matriz, numRandom));
                
            }
        }
        
        //Mostramos la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        
    }
    
    //Metodo para comprobar que no se repitan numeros
    public static boolean comprobarRepetido(int[][] matrizAux, int numComprobar){
        
        //Hacemos un doble bucle for para recorrer la matriz auxiliar
        for (int i = 0; i < matrizAux.length; i++) {
            for (int j = 0; j < matrizAux.length; j++) {
                
                //Si la posicion de la matriz es igual al numero a comprobar devolvemos true
                if(matrizAux [i][j]== numComprobar){
                    return true;
                }
                
            }
        }
        //Sino devolvemos false
        return false;
    }
    
}
