/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Paquete01;

import Paquete02.CiudadHospital;
import Paquete02.EntidadHospitalaria;
import Paquete02.Medico;
import Paquete02.Enfermero;
import java.util.Scanner;

/**
 *
 * @author PabloCosta14
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        String nombreHospital;
        int numeroEspecialidades;
        String ciudad;
        String provincia;
        int medicos;
        int enfermeros;

        Enfermero[] Conjuntoenfermeros;
        Medico[] ConjuntoMedicos;

        // Ingreso de valores por teclado
        System.out.println("Ingrese el nombre del Hospital");
        nombreHospital = entrada.nextLine();
        System.out.println("Ingrese el número de especialidades");
        numeroEspecialidades = entrada.nextInt();

        entrada.nextLine();

        System.out.println("Ingrese el Nombre de la Ciudad");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el Nombre de la provincia");
        provincia = entrada.nextLine();

        CiudadHospital Ch = new CiudadHospital(ciudad, provincia);
       
        System.out.println("Ingrese la direccion del hospital");
        String dir = entrada.nextLine();

        System.out.println("Ingrese el numero de medicos");
        medicos = entrada.nextInt();
        System.out.println("Ingrese el número de enfermeros");
        enfermeros = entrada.nextInt();

        entrada.nextLine();

        Conjuntoenfermeros = new Enfermero[enfermeros];
        ConjuntoMedicos = new Medico[medicos];

        for (int i = 0; i < medicos; i++) {
            System.out.printf("Ingrese nombre del doctor %d\n", i + 1);
            String doctor = entrada.nextLine();
            System.out.printf("Ingrese La especialidad %d\n", i + 1);
            String especialidad = entrada.nextLine();

            System.out.printf("Ingrese El sueldo mensual %d\n", i + 1);
            int sueldo = entrada.nextInt();
            entrada.nextLine();

            Medico me1 = new Medico(doctor, especialidad, sueldo);

            ConjuntoMedicos[i] = me1;

        }

        for (int i = 0; i < enfermeros; i++) {
            System.out.printf("Ingrese nombre del enfermero %d\n", i + 1);
            String enfermero = entrada.nextLine();
            System.out.printf("Ingrese el tipo %d\n", i + 1);
            String tipo = entrada.nextLine();

            System.out.printf("Ingrese El sueldo mensual %d\n", i + 1);
            int sueldo = entrada.nextInt();
            entrada.nextLine();

            Enfermero ef1 = new Enfermero(enfermero, tipo, sueldo);

            Conjuntoenfermeros[i] = ef1;

        }

        EntidadHospitalaria Eh = new EntidadHospitalaria(nombreHospital,
                numeroEspecialidades, dir, ConjuntoMedicos, Conjuntoenfermeros);

        Eh.establecerTotalSueldos();

        System.out.printf("\n%s\nCiudad %s\n Provincia %s\n", Eh,Ch.obtenerNombreCiudad(),Ch.obtenerprovinciaCiudad());
//Licenciado no Puedo insertar  la entidad CiudadHospital al To String 
//porque me dice cadena vacia
    }

}
