/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import java.util.Random;

/**
 *
 * @author smr1d
 */
public class Paciente extends Persona implements Nadadores{

    private String numeroHistoria;

    public Paciente(String numeroHistoria, String nombre, String apellidos, NIF dni) {
        super(nombre, apellidos, dni);
        this.numeroHistoria = numeroHistoria;
    }

    public Paciente(String numeroHistoria) {
        this.numeroHistoria = numeroHistoria;
    }

    public Paciente() {
    }

    public String getNumeroHistoria() {
        return numeroHistoria;
    }

    public void setNumeroHistoria(String numeroHistoria) {
        this.numeroHistoria = numeroHistoria;
    }
    
    public void tomarMedicina(String medicina){
        
        Random random = new Random();
        boolean curado = random.nextBoolean();
        
        System.out.println(getNombre() + getApellidos() + "empieza a tomar " + medicina);
        
        if(curado){
            System.out.println("El paciente " +getNombre() + getApellidos() + " se ha curado");
        }else{
            System.out.println("El paciente " +getNombre() + getApellidos() + " no se ha curado");
        }
        
    }
    
    @Override
    public void Nadadores() {
        System.out.println("El paciente es un nadador");
    }
    
}
