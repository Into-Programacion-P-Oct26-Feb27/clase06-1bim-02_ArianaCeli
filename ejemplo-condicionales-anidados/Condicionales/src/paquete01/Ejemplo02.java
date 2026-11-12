/*
 * Dada una opción (1,2,3), imprimir los valores de verdad
 * para la operación de a y b. Donde 1 es para AND, 2 para OR, 3 para NOT
 */
package paquete01;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // 1 es verdadero
        // 0 es falso
        int a = 1; 
        int b = 0;
        boolean resultado;
        boolean resultado2;
        int opcion;
        System.out.println("Ingrese la operación que requiere generar\n"
                + "1. AND\n"
                + "2. OR\n"
                + "3. NOT");
        opcion = entrada.nextInt();

        if (opcion > 0 && opcion <= 3) {
            if (opcion == 1) {
                System.out.printf("%s\n", "Trabajar con AND\n");
                if (a == 1 && b == 1) {
                    resultado = true;
                } else {
                    resultado = false;
                }
                System.out.printf("a=%d and b=%d resultado %s\n", a, b,
                        resultado);
            } else {
                if (opcion == 2) {
                    System.out.printf("%s\n", "Trabajar con OR");
                    if (a == 1 || b == 1) {
                        resultado = true;
                    } else {
                        resultado = false;
                    }
                    System.out.printf("a=%d or b=%d resultado %s\n", a, b,
                            resultado);
                } else {
                    // se asume opción = 3
                    // sería con NOT
                    System.out.printf("%s\n", "Trabajar con NOT");
                    if (a == 1) {
                        resultado = false;
                    } else {
                        resultado = true;
                    }
                    if (b == 1) {
                        resultado2 = false;
                    } else {
                        resultado2 = true;
                    }
                    System.out.printf("not a=%d resultado %s\n"
                            + "not b=%d resultado %s\n", 
                            a, 
                            resultado,
                            b,
                            resultado2);
                }
            }
        } else {
            System.out.printf("%s\n", "Opción inválida");
        }

    }

}
