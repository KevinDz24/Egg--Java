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
public class Ejercicio19 {
    public static void main(String[] args) {

        int menu;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el monto en euros para convertir");
        double moneda = leer.nextDouble();
        

        System.out.println("A que divisa desea cambiarla");
        System.out.println("1. Libras\n" + "2. Dolar\n" + "3. Yenes\n");
        menu = leer.nextInt();
        System.out.println(divisas(moneda, menu));

    }

    public static double divisas(double a, int b) {
        double num = 0;

        switch (b) {
            case 1:
                num = a * 0.86;
                break;

            case 2:
                num = a * 1.28611;
                break;

            case 3:
                num = a * 129.852;
                break;

            default:
                System.out.println("Opcion incorrecta");
                break;

        }
        return num;
    }

}