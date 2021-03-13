package ar.com.xeven;

import java.util.Scanner;

public class Utilitaria {
    public static int getInt() {
        Scanner sc = new Scanner(System.in);
        String texto = "";
        int numero = 0;
        boolean correcto = false;
        do{
            texto = sc.nextLine();
            try{
                numero = Integer.parseInt(texto);
                correcto = true;
            }catch (NumberFormatException e){
                System.out.print("Ingrese un número correcto: ");
            }
        }while(!correcto);
        return numero;
    }

    public static int getNumeroPositivoMayorA(int minimo){
        int numero = 0;
        while (numero < minimo){
            System.out.println("El numero debe ser mayor a "+minimo);
             numero = getInt();
        }
        return numero;
    }

    public static String getString(String mensaje) {
        String texto = "";
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;
        do{
            System.out.print(mensaje+": ");
            texto = sc.nextLine();
            if(texto.length()>0) correcto=true;
        }while(!correcto);
        return texto;
    }

    public static boolean validarString(String texto, int maximo) {
        return texto.length()<=maximo;
    }
}
