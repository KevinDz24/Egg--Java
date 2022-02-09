/*
 *Implementar un programa que dado dos numeros enteros determine cual es el
mayor y lo muestre por pantalla
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Ejercicio6 {
    
    public static void main(String[] args) {
       
        Scanner leer= new Scanner(System.in);
        int numero1, numero2, mayor = 0;
        
        
        System.out.println("Escriba 2 numeros enteros");   
        
        numero1= leer.nextInt();
        numero2= leer.nextInt();
        
        if(numero1 > numero2){
            mayor = numero1;
            
        }else if (numero2>numero1){
            mayor = numero2;
      
        }
        System.out.println("El numero mayor es: " +mayor);
    }
}
