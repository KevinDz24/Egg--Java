//Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
//de tipo real. A continuación, se deben crear los siguientes métodos:
//a) Método constructor que inicialice el radio pasado como parámetro.
//b) Métodos get y set para el atributo radio de la clase Circunferencia.
//c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
//del objeto.
//d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
//e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
package ejercicio2;

import Entidades.Circunferencia;
import Servicios.CircunferenciaServicios;

public class CircunferenciaPrincipal {

    public static void main(String[] args) {

        CircunferenciaServicios cs = new CircunferenciaServicios();
        Circunferencia op1 = cs.crearCircunferencia();

        System.out.println("El area es " + cs.Area(op1));

        System.out.println("El perimetro es " + cs.Perimetro(op1));

        Circunferencia op2 = cs.crearCircunferencia();

        System.out.println("El area es " + cs.Area(op2));

        System.out.println("El perimetro es " + cs.Perimetro(op2));
    }

}
