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
public class Ejercicio4 {
    
    public static void main(String[] args){
    Scanner leer = new Scanner (System.in);
    double F, C;
        System.out.println("Ingrese la cantidad de grados Celcius:");
        C=leer.nextDouble();
        
         F = 32 + (9 * C / 5.0);
         
         System.out.println(C+" grados Celcius equivalen a "+F+" grados Fahrenheit");
    }
}
