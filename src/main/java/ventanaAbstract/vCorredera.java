/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanaAbstract;

/**
 *
 * @author david
 */
public class vCorredera extends Ventana {
    
    private int longApertura;

    public vCorredera(int longApertura, boolean estado) {
        super(estado);
        this.longApertura = longApertura;
    }
    
    public vCorredera(int longApertura) {//Crea ventana abierta
        super(true);
        this.longApertura = longApertura;
    }

    public vCorredera() {
    }
            
    @Override
    public void abrir(int numero){
        
       this.setEstado(true);
       this.longApertura = numero;
       
    }
    
    @Override
    public void cerrar(int numero){
           
       this.setEstado(false);
        
    }
    
    public int getLongApertura() {
        return longApertura;
    }
    
    public void setLongApertura(int longApertura) {
        this.longApertura = longApertura;
    }

    @Override
    public String toString() {
        return "VCorredera{" + "longApertura=" + longApertura + '}';
    }
    
}
