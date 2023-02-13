/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanaAbstract;

/**
 *
 * @author david
 */
public abstract class Ventana {
    
     //SI PONEMOS PROTECTEC LA CLASE HIJA PODRA MODIFICAR EL ESTADO ESTO SI APLICAN SI LAS 2 CLASES ESTAN SOLAS EN EL MISMO PAQUETE
    private boolean estado;

    public Ventana() {
    }

    public Ventana(boolean estado) {
        this.estado = estado;
    }
    
    //METODOS ABSTRACTO   LAS CLASES QUE SON ABSTRACTAS NO SE PUEDEN SACAR NEW VENTANA
    
    
    //TODAS LAS CLASES HIJAS DEBEN IMPLEMENTER LOS METODOS ABSTRACTOR DE LA CLASE PADRE
    
    public abstract void abrir(int numero);
      
    public abstract void cerrar(int numero);
    
    public boolean isEstado(){
    
    return estado;
    
    }
        
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

  
    @Override
    public String toString() {
        return "Ventana{" + "estado=" + estado + '}';
    }
    
    
    
    
}
