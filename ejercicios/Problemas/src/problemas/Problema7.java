/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema7 {

    public static void main(String[] args) {
        String[] ciudades;
        ciudades = obtenerArreglo();

        fitrarValores(ciudades);

    }

    public static void fitrarValores(String ciudades[]) {
        String acumulador = "";
        for (int j = 0; j < ciudades.length; j++) {
            String caracteres = ciudades[j];
            int cantidad = caracteres.length();
            if (cantidad == 4) {
                acumulador = String.format("%s%d.%s\n"
                        ,acumulador
                        ,j+1
                        ,ciudades[j]);
            } else {
                ciudades[j] = "";
                acumulador = String.format("%s%d.%s\n"
                        ,acumulador
                        ,j+1
                        ,ciudades[j]);
            }
        }
        System.out.printf("\nRespuesta:\n%s", acumulador);
    }

    public static String[] obtenerArreglo() {
        Scanner entrada = new Scanner(System.in);
        int num_a;
        System.out.println("Ingresar el numero de ciudades del Ecuador "
                + "que desea agregar");
        num_a = entrada.nextInt();
        String[] inf = new String[num_a];
        System.out.println("Ingrese las ciudades del Ecuador\n");
        entrada.nextLine();
        for (int i = 0; i < inf.length; i++) {
            System.out.printf("%d. ",i+1);
            inf[i] = entrada.nextLine();
        }
        return inf;
    }
}
