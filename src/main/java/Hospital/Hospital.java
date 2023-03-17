/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import java.util.List;

/**
 *
 * @author smr1d
 */
public class Hospital {
    
    private String nombre;
    private String direccion;
    private int numeroCamas;
    private List<Empleado> listaEmpleados;
    private List<Paciente> listaPacientes;

    public Hospital(String nombre, String direccion, int numeroCamas, List<Empleado> listaEmpleados, List<Paciente> listaPacientes) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroCamas = numeroCamas;
        this.listaEmpleados = listaEmpleados;
        this.listaPacientes = listaPacientes;
    }

    public Hospital() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public List<Paciente> getListaPacientes() {
        return listaPacientes;
    }

    public void setListaPacientes(List<Paciente> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }

    @Override
    public String toString() {
        return "Hospital{" + "nombre=" + nombre + ", direccion=" + direccion + ", numeroCamas=" + numeroCamas + ", listaEmpleados=" + listaEmpleados + ", listaPacientes=" + listaPacientes + '}';
    }
    
    public void contratarEmpleado(Empleado empleadoAux){
        
        this.listaEmpleados.add(empleadoAux);
        
    }
    
    public void ingresarPaciente(Paciente pacienteAux){
        
        this.listaPacientes.add(pacienteAux);
        
    }
}
