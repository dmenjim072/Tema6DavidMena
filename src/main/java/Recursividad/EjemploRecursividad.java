/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Recursividad;

/**
 *
 * @author david
 */
public class EjemploRecursividad {

    public static int factorial(int num){
        
        if(num == 0 || num == 1){
            
            return 1;
            
        }else{
            
            return num*factorial(num-1);
            
        }
        
    }
    
    
    
    public static void main(String[] args) {
        
        System.out.println(factorial(3));
        
    }
}
