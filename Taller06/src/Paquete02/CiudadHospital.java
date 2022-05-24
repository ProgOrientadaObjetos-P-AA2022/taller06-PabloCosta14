/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete02;

/**
 *
 * @author DELL
 */
public class CiudadHospital {

    private String nombreCiudad ;
    private String provinciaCiudad ;

    public CiudadHospital(String a, String n) {
        nombreCiudad = a;
        provinciaCiudad = n;

    }

    public void establecerNombreCiudad(String n) {
        nombreCiudad = n;
    }

    public void establecerProvinciaCiudad(String n) {
        provinciaCiudad = n;
    }

    public String obtenerNombreCiudad() {
        return nombreCiudad;
    }

    public String obtenerprovinciaCiudad() {
        return provinciaCiudad;
    }

}
