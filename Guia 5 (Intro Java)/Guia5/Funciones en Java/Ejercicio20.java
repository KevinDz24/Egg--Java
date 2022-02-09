/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author kevin
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        
         int[] numeros = new int[100];
         
         for(int i = 0; i<=99; i++){
             numeros[i] = i;
         }
         
         for(int i = 99; i>=0; i--){
             System.out.println(numeros[i]);
         }
    }
}
