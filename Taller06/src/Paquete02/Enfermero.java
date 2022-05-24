/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete02;

/**
 *
 * @author DELL
 */
public class Enfermero {

    private String nombre;
    private String tipo;
    private int sueldoMensual;

    public Enfermero(String a, String n, int s) {
        nombre = a;
        tipo = n;
        sueldoMensual = s;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerTipo(String n) {
        tipo = n;
    }

    public void establecerSueldoMensual(int n) {
        sueldoMensual = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public int obtenerSueldoMEnsual() {
        return sueldoMensual;
    }
}
