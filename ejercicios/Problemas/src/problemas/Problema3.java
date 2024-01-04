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
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double[] notas = new double[4];
        int opcion1;
        boolean bandera = true;
        while (bandera) {
            for (int i = 0; i < notas.length; i++) {
                System.out.println("Ingrese las cuatro notasa");
                notas[i] = entrada.nextInt();
                obtenerPromedioCualitativo(notas)
            }

            System.out.println("Si quiere terminar el proceso digite 1");
            opcion1 = entrada.nextInt();
            if (opcion1 == 1) {
                bandera = false;
            }

        }
    }

    public static String obtenerPromedioCualitativo() {
        Scanner entrada = new Scanner(System.in);
        double promedio;
        double area;
        System.out.println("Ingresar el lado del cuadrado");
        lado = entrada.nextDouble();
        area = lado * lado * lado * lado;
        return promedio
    }

}
