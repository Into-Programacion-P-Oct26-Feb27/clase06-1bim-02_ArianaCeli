/*
* Realizar una miniespecificación que permita seleccionar el tipo de
* operación aritemética (+,-,*) a realizar para dos valores ingresados por teclado
* Realizar la operación y presentar el resultado en pantalla
 */
package paquete02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int op;
        int valor1;
        int valor2;
        int resultado = 0;
        // 6.  Escribir "Ingrese el primer valor la operación"
        System.out.println("Ingrese el primer valor la operación");
        // 7.  Leer valor1
        valor1 = entrada.nextInt();
        System.out.println("Ingrese el segundo valor la operación");
        valor2 = entrada.nextInt();

        System.out.println("Selecciones la operación que desea realizar\n"
                + "Ingrese 1 para sumar\n"
                + "Ingrese 2 para restar\n"
                + "Ingrese 3 para multiplicar");
        op = entrada.nextInt(); // 4

        if (valor1 > 20 && valor2 > 20) {
            switch (op) {

                case 1:
                    resultado = valor1 + valor2;
                    break;

                case 2:
                    resultado = valor1 - valor2;
                    break;

                case 3:
                    resultado = valor1 * valor2;
                    break;

                default:
                    System.out.println("Operación incorrecta");
                    break;

            }

        } else {
            System.out.println("Valor fuera de rango");

        }

        // Escribir "El resultado de la operación es :" + resultado
        System.out.printf("El resultado de la operación es : %d\n", resultado);
    }
}
