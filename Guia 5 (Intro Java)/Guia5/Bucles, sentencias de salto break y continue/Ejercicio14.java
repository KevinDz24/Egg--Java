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
public class Ejercicio14 {
    public static void main(String[] args) {
        int num, i, suma, num2;
        Scanner leer = new Scanner(System.in);
        
        i=0;
        suma=0;
        
        while(i!=20){
        i++;
            System.out.println("Ingrese un numero: ");
            num= leer.nextInt();
            
            while(num<0){
                System.out.println("Numero incorrecto intente de nuevo");
                System.out.println("Ingrese un numero: ");
                num= leer.nextInt();
            }
            if(num==0){
                System.out.println("Se capturo el cero");
                break;
            }
            suma = suma + num;
        }
            System.out.println("La suma de los valores es de:" +suma);
    }
}
