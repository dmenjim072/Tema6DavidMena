/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

/**
 *
 * @author smr1d
 */
public class Administrativo extends Empleado{

    private Grupo grupo;

    public Administrativo(Grupo grupo, String numeroSeguridadSocial, double salario, String nombre, String apellidos, NIF dni) {
        super(numeroSeguridadSocial, salario, nombre, apellidos, dni);
        this.grupo = grupo;
    }

    public Administrativo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Administrativo() {
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
    
    public void registrarDocumento(String nombreDocumento){
        
        System.out.println("El administrativo " + getNombre() + getApellidos() + " ha realizado el documento " + nombreDocumento);
        
    }
    
    @Override
    public double calcularIRPF() {
    double resultado = 0;

        switch (getGrupo()) {
            case C ->
                resultado = getSalario() * (getGrupo().getIrpf() / 100);

            case D ->
                resultado = getSalario() * (getGrupo().getIrpf() / 100);

            case E ->
                resultado = getSalario() * (getGrupo().getIrpf() / 100);

        }

        return resultado;    }
    
    
    
}
