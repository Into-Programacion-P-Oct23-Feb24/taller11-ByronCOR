/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Locale;
import java.util.Scanner;


/**
 *
 * @author reroes
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int opcion1;
        int opcion2;
        String nombre;
        String cedula;
        boolean bandera = true;
        while (bandera) {
            System.out.printf("Ingrese su nombre:\n");
            nombre = entrada.nextLine();
            System.out.printf("Ingrese su cedula:\n");
            cedula = entrada.nextLine();
            System.out.println("\nPara calcular el valor de la planilla de luz"
                    + "digite: 1\nPara calcular el valor del predio de un "
                    + "bien inmueble digite: 2\n");
            opcion1 = entrada.nextInt();
            if (opcion1 == 1) {
                calcularValorLuz(nombre, cedula);
            } else {
                if (opcion1 == 2) {
                    calcularPredio(nombre, cedula);
                }
            }
            System.out.println("\nSi quiere terminar el proceso digite 1");
            opcion2 = entrada.nextInt();
            if (opcion2 == 1) {
                bandera = false;
            }
        }
    }
     public static void calcularValorLuz(String n,String c) {
        Scanner entrada = new Scanner(System.in);
        double valorKw;
        double consumoKw;
        double total;
        System.out.println("Ingresar el valor del Kilowatio");
        valorKw = entrada.nextDouble();
                System.out.println("Ingresar el cosumo mensual de Kilowatios");
        consumoKw = entrada.nextDouble();
        total = ( valorKw * consumoKw );
        System.out.printf("Cliente %s con cedula %s debe cancelar el valor "
                + "de $ %.2f\n"
                ,n
                ,c
                ,total);
    }
        public static void calcularPredio(String n,String c) {
        Scanner entrada = new Scanner(System.in);
        double valor;
        double total;
        System.out.println("Ingresar el valor del inmueble");
        valor = entrada.nextDouble();
        total = valor-((valor * 2)/100);
        System.out.printf("Cliente %s con cedula %s tiene un bien inmueble "
                + "valorado en $ %.2f y tiene que pagar un total de $ %.2f\n"
                ,n
                ,c
                ,valor
                ,total);
    }

}
