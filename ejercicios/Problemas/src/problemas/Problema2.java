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
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int opcion1;
        int opcion2;
        boolean bandera = true;
        while (bandera) {
            System.out.println("ingresar:\n"
                    + "1 para calcular el area del cuadrado\n"
                    + "2 para calcular el area del triangulo\n"
                    + "3 para calcular el area del rectangulo\n");
            opcion1 = entrada.nextInt();
            if (opcion1 == 1) {
                obtenerAreaCuadrado();
            } else {
                if (opcion1 == 2) {
                    obtenerAreaTriangulo();
                } else {
                    if (opcion1 == 3) {
                        obtenerAreaRectangulo();
                    }
                }
            }
            System.out.println("Si quiere terminar el proceso digite 1");
            opcion2 = entrada.nextInt();
            if (opcion2 == 1) {
                bandera = false;
            }
        }
    }

    public static void obtenerAreaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        double lado;
        double area;
        System.out.println("Ingresar el lado del cuadrado");
        lado = entrada.nextDouble();
        area = lado * lado * lado * lado;
        System.out.printf("El area del cuadrado es igual a %.2f\n", area);
    }

    public static void obtenerAreaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        double altura;
        double base;
        double area;
        System.out.println("Ingresar la base del triangulo");
        base = entrada.nextDouble();
        System.out.println("Ingresar la altura del triangulo");
        altura = entrada.nextDouble();
        area = (base * altura) / 2;
        System.out.printf("El area del triangulo es igual a %.2f\n", area);
    }

    public static void obtenerAreaRectangulo() {
        Scanner entrada = new Scanner(System.in);
        double altura;
        double base;
        double area;
        System.out.println("Ingresar la base del rectangulo");
        base = entrada.nextDouble();
        System.out.println("Ingresar la altura del rectangulo");
        altura = entrada.nextDouble();
        area = base * altura;
        System.out.printf("El area del rectangulo es igual a %.2f\n", area);
    }
}
