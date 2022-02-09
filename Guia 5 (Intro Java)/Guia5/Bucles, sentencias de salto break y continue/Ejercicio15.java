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
public class Ejercicio15 {
    public static void main(String[] args){
      int num1, num2, menu;
        int suma, resta, multiplicar, dividir;
        String confirma;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese numero 1");
        num1 = leer.nextInt();
        System.out.println("Ingrese numero 2");
        num2 = leer.nextInt();

        do {
            System.out.println("Elija la opcion que desea realizar");
            System.out.println("1. Sumar\n" + "2. Restar\n" + "3. Multiplicar\n" + "4. Dividir\n" + "5. Salir\n" + "Elija opción:");

            menu = leer.nextInt();

            switch (menu) {
                case 1:
                    suma = num1 + num2;
                    System.out.println("La suma es : " + suma);
                    break;
                case 2:
                    resta = num1 - num2;
                    System.out.println("La resta es : " + resta);
                    break;
                case 3:
                    multiplicar = num1 * num2;
                    System.out.println("La multiplicacion es : " + multiplicar);
                    break;
                case 4:
                    dividir = num1 / num2;
                    System.out.println("La division es : " + dividir);
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa\n"
                            + " (S/N)?");
                    leer.nextLine();
                    confirma = leer.nextLine();
                    if (confirma.equals("S"))   {
                    break;
                    }
                    else   
                    continue;    

            }

        } while (menu != 5);

    }

}
/*¿Está seguro que desea salir del programa
 * (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
 * contrario se vuelve a mostrar el menú.*/   
    
       