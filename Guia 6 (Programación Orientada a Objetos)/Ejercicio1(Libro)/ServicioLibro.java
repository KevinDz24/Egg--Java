package Servicios;
import Entidades.Libro;
import java.util.Scanner;

//Crear un método para cargar un libro pidiendo los
//datos al usuario y luego informar mediante otro método el número de ISBN, el título,
//el autor del libro y el numero de páginas.

public class ServicioLibro {
    Scanner leer = new Scanner(System.in);
    public Libro crearLibro(){
        Libro libroMolde = new Libro();
        
        System.out.println("Escriba el titulo del libro: ");
        libroMolde.setTitulo(leer.nextLine());
        
        System.out.println("Escriba el nombre del autor: ");
        libroMolde.setAutor(leer.nextLine());
        
        System.out.println("Escriba el numero de paginas: ");
        libroMolde.setPaginas(leer.nextInt());
        
        System.out.println("Escriba el ISBN: ");
        libroMolde.setISBN(leer.nextDouble());
        
        return libroMolde;
        
    }

    
    
}
