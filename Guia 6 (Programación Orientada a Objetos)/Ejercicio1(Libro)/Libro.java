package Entidades;


public class Libro {
    
   private String Titulo;
   private String Autor;
   private int Paginas;
   private Double ISBN;
    
   //Constructor por defecto 

    public Libro() {
    }
    
    //Constructor por parametros

    public Libro(String Titulo, String Autor, int Paginas, Double ISBN) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Paginas = Paginas;
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getPaginas() {
        return Paginas;
    }

    public void setPaginas(int Paginas) {
        this.Paginas = Paginas;
    }

    public Double getISBN() {
        return ISBN;
    }

    public void setISBN(Double ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Libro{" + "Titulo=" + Titulo + ", Autor=" + Autor + ", Paginas=" + Paginas + ", ISBN=" + ISBN + '}';
    }
    
    
}
