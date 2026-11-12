/*
*   Generar un programa que permita ingresar un nombre de una ciudad;
*   Los nombres de las ciudades permitidas son las que empiezan con vocal.
*   Si la ciudad es permitida presentar un mensaje:
*   Nombre con inicial O de otavalo
*   Si la ciudad no es permitida presentar un mensaje:
*   opción incorrecta; ninguna de las anteriores
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        System.out.println("Ingrese el nombre de una ciudad del Ecuador");
        String nombre = entrada.nextLine();
        // nombre = "atacames"
        char valor = nombre.charAt(0); // obtener el primer caracter de una
                                       // cadena
        //  L   o   j   a
        //  0   1   2   3
        switch(valor){
            case 'a':
            case'A':
                System.out.printf("Nombre con inicial %s de %s\n", 
                        valor, nombre.toLowerCase());
                break;
            
            case 'e':
            case 'E':
                System.out.printf("Nombre con inicial %s de %s\n", 
                        valor, nombre.toLowerCase());
                break;    
             
            case 'i':
            case 'I':
                System.out.printf("Nombre con inicial %s de %s\n", 
                        valor, nombre.toLowerCase());
                break;    
            
            case 'o':
            case 'O':
                System.out.printf("Nombre con inicial %s de %s\n", 
                        valor, nombre.toLowerCase());
                break;     
            
            case 'u':
            case 'U':
                System.out.printf("Nombre con inicial %s de %s\n", 
                        valor, nombre.toLowerCase());
                break;    
            
            default:
                System.out.println("opción incorrecta; ninguna de las "
                        + "anteriores");
                break;
                
        }
        
    }
}
