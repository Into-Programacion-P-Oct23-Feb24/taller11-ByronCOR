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
        double[] n = new double[4];
        int opcion1;
        String promedio;
        boolean bandera = true;
        while (bandera) {
            for (int i = 0; i < n.length; i++) {
                System.out.printf("Ingrese la nota %d:\n", i + 1);
                n[i] = entrada.nextInt();
            }
            promedio = obtenerPromedioCualitativo(n[0], n[1], n[2], n[3]);
            System.out.printf("El promedio de las notas: "
                    + "%.0f,%.0f,%.0f,%.0f es %s\n"
                    ,n[0]
                    ,n[1]
                    ,n[2]
                    ,n[3]
                    ,promedio);
            System.out.println("Si quiere terminar el proceso digite 1");
            opcion1 = entrada.nextInt();
            if (opcion1 == 1) {
                bandera = false;
            }

        }
    }

    public static String obtenerPromedioCualitativo(double n1
            , double n2
            , double n3
            , double n4) {
        double prom;
        String promedio="";
        prom = (n1 + n2 + n3 + n4)/4;
        if (prom >= 0 & prom <= 5) {
            promedio = "Regular";
        } else {
            if (prom > 5 & prom <= 8) {
                promedio = "Bueno";
            } else {
                if (prom > 8 & prom <= 9) {
                    promedio = "Muy Bueno";
                } else {
                    if (prom > 8 & prom <= 9) {
                        promedio = "Sobresaliente";
                    }
                }
            }
        }
        return promedio;
    }
}
