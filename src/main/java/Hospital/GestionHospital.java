/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author smr1d
 */
public class GestionHospital {
    
    public static Paciente crearPaciente(Persona auxP, String numeroHistorial) {
        Paciente pacienteAux = new Paciente(numeroHistorial, auxP.getNombre(), auxP.getApellidos(), auxP.getDni());
        return pacienteAux;
    }
    
     public static Medico crearMedico(Persona auxP, String especialidad, String numeroSeguridad, double sueldo) {

        Medico aux = new Medico(especialidad, numeroSeguridad, sueldo, auxP.getNombre(), auxP.getApellidos(), auxP.getDni());

        return aux;
    }
     
     public static Administrativo crearPersonalPas(Persona auxP, String numeroSeguridad, double sueldo, Grupo grupo) {
        Administrativo aux = new Administrativo(grupo, numeroSeguridad, sueldo, auxP.getNombre(), auxP.getApellidos(), auxP.getDni());
        return aux;
    }
     
     public static void main(String[] args) {
        
        List<Empleado> listaEmpleados = new ArrayList<>();

        List<Paciente> listaPaciente = new ArrayList<>();
        
        NIF n1 = new NIF(12334, 'a', LocalDate.of(2023, Month.MARCH, 4));
        NIF n2 = new NIF(12335, 'b', LocalDate.of(2022, Month.MARCH, 3));
        NIF n3 = new NIF(12345, 'c', LocalDate.of(2021, Month.JANUARY, 14));
    }
    
}
