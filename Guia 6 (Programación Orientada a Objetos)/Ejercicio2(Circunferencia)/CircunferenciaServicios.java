//c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
//del objeto.
//d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
//e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
package Servicios;

import Entidades.Circunferencia;
import java.util.Scanner;

public class CircunferenciaServicios {

    Scanner leer = new Scanner(System.in);

    public Circunferencia crearCircunferencia() {
        double Radio;

        System.out.println("Ingrese el radio: ");
        Radio = leer.nextDouble();

        return new Circunferencia(Radio);
    }

    public double Area(Circunferencia op1) {
        return Math.PI * op1.getRadio() * op1.getRadio();

    }

    public double Perimetro(Circunferencia op1) {
        return 2 * Math.PI * op1.getRadio();
    }
}
