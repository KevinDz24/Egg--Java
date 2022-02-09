/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Ejercicio3 {
    
    public static void main(String[] args){
       Scanner leer= new Scanner(System.in);
        String cadena1;
        String cadena2;
        
        System.out.println("Ingrese una frase");
        cadena1= leer.next();
        System.out.println(cadena1.toUpperCase());
        System.out.println("Escriba otra frase");
        cadena2= leer.next();
        System.out.println(cadena2.toLowerCase());
    }
            
}
