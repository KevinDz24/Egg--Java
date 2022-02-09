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
public class Ejercicio23 {
     public static void main(String[] args) {

        int[][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                matriz[i][j] = (int) Math.floor(Math.random()*10+1);

            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.print(matriz[i][j] + " ");

            }
            System.out.println("");
        }
        int aux;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }

        }
        System.out.println("\nLa matriz transpuesta es: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

}
