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
public class Ejer02 {
       
    public static void main(String[] args) {
        
        int n = 8;//Tamaño de la matriz
        
        int [][] matriz = new int[n][n];//Creamos la matriz con valor n
        
        Random r = new Random();
                                        
        //Hacemos un bucle para rellenar la matriz con 0 y 1
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
                //A cada posicion de la matriz le damos valor entre 0 y 1 random
                int randomBinario = r.nextInt(0, 1+1);
                matriz[i][j] = randomBinario;
                
            }
        }
                               
        //Mostramos la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        
        //Creamos un array en el que le damos el valor del metodo llamado
        int[] coordenadas = encontrarCoordenadas(matriz);
        
        //
        if(coordenadas != null){
            
            //Mostramos las coordenadas de la posicion pedida
            System.out.println("La posicion pedida se encuentra en las coordenadas " + coordenadas[0] + "y " + coordenadas[1]);
            
        }else{
            
            System.out.println("No hay ninguna posicion encontrada");
            
        }
        
    }
    
    //Metodo para encontrar la posicion
    public static int[]encontrarCoordenadas(int[][] auxMatriz){
        
        //Declaramos un array para la coordenada
        int [] coordenada = new int[2];
        
        for (int i = 0; i < auxMatriz.length -1; i++) {
            for (int j = 0; j < auxMatriz.length -1; j++) {
                
                //Si la posicion de la matriz es 0 y las esquinas son 1
                if(auxMatriz[i][j]==0 && auxMatriz[i-1][j-1]==1 && auxMatriz[i+1][j-1]==1 && auxMatriz[i-1][j+1]==1 && auxMatriz[i+1][j+1]==1){
                    
                    //A la posicion 0 y 1 de coordenada le asignamos los valores de i y j
                    coordenada[0] = i;
                    coordenada[1] = j;
                    
                    return coordenada;
                }
                
            }
        }
        return null;
        
    }
        
}
