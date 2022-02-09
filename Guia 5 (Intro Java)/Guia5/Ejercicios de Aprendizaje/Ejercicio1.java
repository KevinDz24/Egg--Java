/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        double Numero1=0;
        double Numero2=0;
        double suma=0;
        System.out.println("Ingrese el primer numero");
        Numero1=entrada.nextDouble();
        System.out.println("Ingrese el segundo numero");
        Numero2=entrada.nextDouble();
        
        suma=Numero1 + Numero2;
        
        System.out.println("La suma de los 2 numeros es: " +suma);
    }
    
}
