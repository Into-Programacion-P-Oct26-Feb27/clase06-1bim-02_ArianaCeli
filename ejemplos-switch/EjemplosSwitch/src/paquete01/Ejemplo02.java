/*
*   Generar un programa que permita ingresar el número de día de la semana;
*   (1 - 7)
*   Si el usuario ingresa el 1, debe presentar el mensaje: Día 1  es Lunes
*   Si el usuario ingresa el 2, debe presentar el mensaje: Día 2  es Martes
*   Si el usuario ingresa el 3, debe presentar el mensaje: Día 3  es Miércoles
*   Si el usuario ingresa el 4, debe presentar el mensaje: Día 4  es Jueves
*   Si el usuario ingresa el 5, debe presentar el mensaje: Día 5  es Viernes
*   Si el usuario ingresa el 6, debe presentar el mensaje: Día 6  es Sábado
*   Si el usuario ingresa el 7, debe presentar el mensaje: Día 7  es Domingo
*   Si el usuario ingresa un número diferente de 1,2,3,4,5,6,7; debe presentar
*   un mensaje: Opción incorrecta

 */
package paquete01;

import java.util.Locale;
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
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Ingrese el número de día de la semana");
        int numeroDia = entrada.nextInt();

        switch (numeroDia) {
            case 1:
                System.out.printf("Día %d es %s\n", numeroDia, 
                        "Lunes");
                break;

            case 2:
                System.out.printf("Día %d es %s\n", numeroDia, 
                        "Martes");
                break;

            case 3:
                System.out.printf("Día %d es %s\n", numeroDia, 
                        "Miércoles");
                break;

            case 4:
                System.out.printf("Día %d es %s\n", numeroDia, 
                        "Jueves");
                break;

            case 5:
                System.out.printf("Día %d es %s\n", numeroDia, 
                        "Viernes");
                break;

            case 6:
                System.out.printf("Día %d es %s\n", numeroDia, 
                        "Sábado");
                break;

            case 7:
                System.out.printf("Día %d es %s\n", numeroDia, 
                        "Domingo");
                break;

            default:
                System.out.println("Opción incorrecta");
                break;
        }

    }
}
