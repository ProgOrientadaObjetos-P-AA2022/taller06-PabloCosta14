/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete02;

/**
 *
 * @author DELL
 */
public class Medico {
    private String nombreDoctor;
    private String especialidad;
    private int sueldoMensual;

    public Medico(String a, String n, int s) {
        nombreDoctor = a;
        especialidad = n;
        sueldoMensual = s;
    }

    public void establecerNombreDoctor(String n) {
        nombreDoctor = n;
    }

    public void establecerEspecialidad(String n) {
        especialidad = n;
    }
    
    public void establecerSueldoMensual(int n) {
        sueldoMensual = n;
    }

    public String obtenerNombreDoctor() {
        return nombreDoctor;
    }

    public String obtenerEspecialidad() {
        return especialidad;
    }
    
    public int obtenerSueldoMensual() {
        return sueldoMensual;
    }

}
