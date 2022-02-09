/*
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
 *
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        String frase;
        
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Escriba una frase:");
        frase = leer.nextLine();
        
        if(frase.equals("eureka")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
}
