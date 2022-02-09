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
public class Ejercicio21 {
public static void main(String[] args) {

        int vector;
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el tamaño del vector deseado");
        vector = leer.nextInt();

        int[] numeros = new int[vector];
        boolean seEncontroNum = false;

        for (int i = 0; i < numeros.length; i++) {
            //System.out.println("Ingrese un numero para completar el vector");
            numeros[i] = (int) Math.floor(Math.random()*10+1);
//numeros[i] = leer.nextInt();

        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        int buscador;
        System.out.println("Que numero quiere buscar: ");
        buscador = leer.nextInt();
        for (int i = 0; i < numeros.length; i++) {

            if (buscador == numeros[i]) {
                System.out.println("El numero esta en la posicion " + i);
                seEncontroNum = true;

            }

        }
        if (seEncontroNum == false) {
            System.out.println("No se encontro ese numero");
        }
    }
}