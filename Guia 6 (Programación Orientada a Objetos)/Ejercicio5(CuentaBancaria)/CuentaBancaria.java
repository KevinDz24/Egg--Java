package Entidades;

public class CuentaBancaria {
    
    ///Atributos
    private Double numeroCuenta;
    private Integer DNI;
    private Double sueldoActual;
    private Double ingreso;
    private Double retiro;

    ///Contructor por parametros

    public CuentaBancaria(Double numeroCuenta, Integer DNI, Double sueldoActual, Double ingreso, Double retiro) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.sueldoActual = sueldoActual;
        this.ingreso = ingreso;
        this.retiro = retiro;
    }
    
    ///Contructor vacio
    public CuentaBancaria() {
    }
    
    /// Get y Set
    public Double getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(Double numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public Double getSueldoActual() {
        return sueldoActual;
    }

    public void setSueldoActual(Double sueldoActual) {
        this.sueldoActual = sueldoActual;
    }

    public Double getIngreso() {
        return ingreso;
    }

    public void setIngreso(Double ingreso) {
        this.ingreso = ingreso;
    }

    public Double getRetiro() {
        return retiro;
    }

    public void setRetiro(Double retiro) {
        this.retiro = retiro;
    }

}
