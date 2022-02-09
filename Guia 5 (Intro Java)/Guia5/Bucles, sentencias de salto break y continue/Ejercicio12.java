/*
 *Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta. 
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        int nota;
        Scanner leer = new Scanner(System.in);
        
        do {            
            System.out.println("Escriba una nota de 0 a 10: ");
            nota = leer.nextInt();
        if (nota >=0 && nota <=10){
            System.out.println("La nota es correcta");
            break;
         }    
        } while (true);
    }
}
