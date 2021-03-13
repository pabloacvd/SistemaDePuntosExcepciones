package ar.com.xeven;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	Crear un sistema que permita registrar usuarios de una empresa para un sistema de premios.
    Para el registro se necesita el nombre y legajo.
    El legajo debe tener 4 letras o números, y comenzar con "A", "B" o "C".
    No permitir el registro si el legajo no es correcto.
	 */
        PremiosYRecompensas premios = new PremiosYRecompensas();
        Scanner sc = new Scanner(System.in);
        int op = 0;
        System.out.println("Vamos a agregar empleados!");
        do{
            premios.registrarNuevoEmpleado();
            System.out.print("¿Desea agregar más empleados? (1=si, 0=no) ");
            op = Utilitaria.getInt();
        }while(op!=0);

        System.out.println("Veamos la lista de empleados: ");
        premios.listarEmpleados();
    }
}
