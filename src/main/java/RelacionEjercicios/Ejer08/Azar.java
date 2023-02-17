/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RelacionEjercicios.Ejer08;

/**
 *
 * @author david
 */
public abstract class Azar {
                
    protected int posibilidades;
    public abstract int lanzar();

    public Azar(int posibilidades) {
        this.posibilidades = Math.abs(posibilidades);
    }

    public int getPosibilidades() {
        return posibilidades;
    }
    
    
               
}
