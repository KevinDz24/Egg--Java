package Entidades;

public class Circunferencia {

    //Atributos
    private double Radio;

    //Constructor por parametros
    public Circunferencia(double Radio) {
        this.Radio = Radio;
    }

    //Constructor vacio
    public Circunferencia() {
    }

    //Metodo get es para acceder 
    public double getRadio() {
        return Radio;
    }

    //Metodo set para definir valor
    public void setRadio(double Radio) {
        this.Radio = Radio;
    }

}
