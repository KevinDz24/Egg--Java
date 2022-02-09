/*
 *Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.

 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        String palabra;
        String a;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escriba una frase o palabra: ");
        palabra = leer.nextLine();
        System.out.println(palabra.substring(0, 0));
        
        if(palabra.equals("a")){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
        
    }
}
