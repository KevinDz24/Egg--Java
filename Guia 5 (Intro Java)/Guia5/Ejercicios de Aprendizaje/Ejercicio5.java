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
public class Ejercicio5 {
    
    public static void main(String[]args){
    
        double numero;
        int numero_doble;
        int numero_triple;
        double raiz_cuadrada;
        
        System.out.println("Escriba un numero para saber su doble, triple y raiz cuadrada:");
        
        Scanner scan= new Scanner(System.in);
        
        
        numero = (int) scan.nextDouble();
        
        numero_doble= (int) (numero * 2);
        numero_triple= (int) (numero * 3);
        raiz_cuadrada= Math.sqrt(numero);   
        
        System.out.println("El doble de " + numero + " es =" +numero_doble);
        System.out.println("El triple de " + numero + " es =" +numero_triple);
        System.out.println("La raiz cuadrada de " + numero + " es =" +raiz_cuadrada);
    }
}
