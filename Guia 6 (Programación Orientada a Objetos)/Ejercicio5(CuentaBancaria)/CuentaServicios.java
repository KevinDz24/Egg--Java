///• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
///• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
///ingresar y se la sumara a saldo actual.
///• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
///se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
///pondrá el saldo actual en 0.
///• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
///que el usuario no saque más del 20%.
///• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
///• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

public class CuentaServicios {
    Scanner leer = new Scanner(System.in);
    
    public CuentaBancaria crearCuenta(){
        CuentaBancaria cuentaMolde = new CuentaBancaria();
        
            System.out.println("Ingrese el numero de cuenta: ");
            cuentaMolde.setNumeroCuenta(leer.nextDouble());
            
            System.out.println("Ingrese el DNI: ");
            cuentaMolde.setDNI(leer.nextInt());
            
            System.out.println("Ingrese el sueldo actual :");
            cuentaMolde.setSueldoActual(leer.nextDouble());
            
            System.out.println("Escriba la cantidad de dinero que quiera ingresar :");
            cuentaMolde.setIngreso(leer.nextDouble());
            
            System.out.println("Escriba la cantidad de dinero que quiera retirar :");
            cuentaMolde.setRetiro(leer.nextDouble());
    
            return cuentaMolde;
    }
    
    public Double ingresar(CuentaBancaria op1){
        return op1.getIngreso() + op1.getSueldoActual();
    }
    
    public Double retirar(CuentaBancaria op1){
        return op1.getRetiro() - op1.getSueldoActual();
    }
    
    
}
