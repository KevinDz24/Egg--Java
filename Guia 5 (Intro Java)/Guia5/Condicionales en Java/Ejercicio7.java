/*
 * Crear un programa que dado un numero determine si es par o impar.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        int numero;
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Escriba un numero:");
   
         int resultado = leer.nextInt();
        numero = resultado;
        
        if (numero % 2==0){
            System.out.println("Es par");
        }else
            System.out.println("Es impar");
       
    }
}
