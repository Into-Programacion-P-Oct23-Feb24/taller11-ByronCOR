/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema6 {

    public static void main(String[] args) {
        double media;
        double desviacion;
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        media = obtenerMedia(informacion);
        desviacion = obtenerDesviacion(informacion, media);
        System.out.printf("La media aritmetica es: %.2f\n",media);
        System.out.printf("la desviacion estandar es:%.2f",desviacion);
    }

    public static double obtenerMedia(int[] numeros) {
        int suma = 0;
        double media;
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }
        media = (double) suma / numeros.length;
        return media;
    }

    public static double obtenerDesviacion(int[] numeros, double media) {
        double desvi;
        double[] resta = new double[numeros.length];
        double[] r = new double[numeros.length];
        double suma = 0;
        for (int i = 0; i < numeros.length; i++) {
             resta[i] = numeros[i] - media;
            r[i] = (Math.pow(resta[i], 2));
            suma = suma + r[i];
        }
        desvi = Math.sqrt(suma /(numeros.length));

        return desvi;
    }
}
