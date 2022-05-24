/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete02;

/**
 *
 * @author DELL
 */
public class EntidadHospitalaria {

    private String nombreHospital;
    private CiudadHospital ciudadhospital;
    private int numeroEspecialidades;
    private int totalSueldos;
    private Medico medicos;
    private Enfermero enfermeros;
    private String direccion;
    private Enfermero[] Conjuntoenfermeros;
    private Medico[] ConjuntoMedicos;

    public EntidadHospitalaria(String a, int c, String d, Medico[] s, Enfermero[] n) {
        nombreHospital = a;
        numeroEspecialidades = c;
        direccion = d;
        ConjuntoMedicos = s;
        Conjuntoenfermeros = n;

    }

    public void establecerNombreHospital(String n) {
        nombreHospital = n;
    }

    public void establecerCiudadhospital(CiudadHospital n) {
        ciudadhospital = n;
    }

    public void establecerNumeroEspecialidades(int n) {
        numeroEspecialidades = n;
    }

    public void establecerTotalSueldos(int n) {
        totalSueldos = n;

    }

    public void establecerMedicos(Medico n) {
        medicos = n;
    }

    public void establecerEnfermeros(Enfermero n) {
        enfermeros = n;
    }

    public void establecerTotalSueldos() {
        int s = 0;
        int z = 0;
        for (int i = 0; i < ObtenerMedico().length; i++) {
            s = s + ObtenerMedico()[i].obtenerSueldoMensual();
        }
        for (int i = 0; i < ObtenerEnfermero().length; i++) {
            z = z + ObtenerEnfermero()[i].obtenerSueldoMEnsual();
        }

        totalSueldos = z + s;
    }

    public void establecerDireccion(String n) {
        direccion = n;
    }

    public void establecerMedicos(Medico[] n) {
        ConjuntoMedicos = n;
    }

    public void establecerEnfermeros(Enfermero[] n) {
        Conjuntoenfermeros = n;
    }
    //----------------------------------------------------------------\\

    public String obtenerNombreHospital() {
        return nombreHospital;
    }

    public CiudadHospital obtenerciudadhospital() {
        return ciudadhospital;
    }

    public int obtenerNumeroEspecialidades() {
        return numeroEspecialidades;
    }

    public int obteneroTotalSueldos() {
        return totalSueldos;
    }

    public Medico obteneroMedicos() {
        return medicos;
    }

    public Enfermero obteneroEnfermeros() {
        return enfermeros;
    }

    public String obteneroDireccion() {
        return direccion;
    }

    public Medico[] ObtenerMedico() {
        return ConjuntoMedicos;
    }

    public Enfermero[] ObtenerEnfermero() {
        return Conjuntoenfermeros;
    }

    @Override
    public String toString() {
        String cadena = "Reporte\n";
        cadena = String.format("%s %s\nDireccion: %s\nCiudad: %s\nProvincia:"
                + "\nNumero de especialidades: %s\n", cadena,
                obtenerNombreHospital(), obteneroDireccion(),
                obtenerciudadhospital().,
                obtenerNumeroEspecialidades());
        cadena = String.format("%sListado de Medicos\n", cadena);
        for (int i = 0; i < ObtenerMedico().length; i++) {
            cadena = String.format("%s- %s - sueldo: %s - %s\n", cadena,
                    ObtenerMedico()[i].obtenerNombreDoctor(),
                    ObtenerMedico()[i].obtenerEspecialidad(),
                    ObtenerMedico()[i].obtenerSueldoMensual());
        }
        cadena = String.format("%sListado de Enfermeros(as)\n", cadena);
        for (int i = 0; i < ObtenerEnfermero().length; i++) {
            cadena = String.format("%s- %s - sueldo: %s - %s\n", cadena,
                    ObtenerEnfermero()[i].obtenerNombre(),
                    ObtenerEnfermero()[i].obtenerTipo(),
                    ObtenerEnfermero()[i].obtenerSueldoMEnsual());
        }
        cadena = String.format("%sTotal De sueldos a pagar por mes: %s",
                cadena, obteneroTotalSueldos());
        return cadena;
    }
}
