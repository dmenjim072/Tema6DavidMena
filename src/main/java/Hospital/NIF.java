/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import RelacionEjercicios.Ejer11.Figura;
import java.time.LocalDate;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author smr1d
 */
public class NIF {
    
    private long numero;
    private char letra;
    private LocalDate fechaCaducidad;

    public NIF(long numero, char letra, LocalDate fechaCaducidad) {
        this.numero = numero;
        this.letra = calcularLetra();
        this.fechaCaducidad = fechaCaducidad;
    }

    public NIF() {
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        return "NIF{" + "numero=" + numero + ", letra=" + letra + ", fechaCaducidad=" + fechaCaducidad + '}';
    }
    
    private char calcularLetra(){
        String letra = RandomStringUtils.randomAlphabetic(1).toUpperCase();
        char aux = letra.charAt(0);
        return aux;
    }
    
    public LocalDate renovar(LocalDate fechaSolicitudRenovacion){
        
        return this.fechaCaducidad = fechaSolicitudRenovacion.plusYears(10);
        
    }
    
    
}
