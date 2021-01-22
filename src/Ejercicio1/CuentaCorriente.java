package Ejercicio1;

public class CuentaCorriente {
    private String nombre;
    private double saldo;
    private String numeroCuenta;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public CuentaCorriente(String nombre, String numero, double saldo){
        this.nombre = nombre;
        this.numeroCuenta = numero;
        this.saldo = saldo;
    }
    public CuentaCorriente(CuentaCorriente objCuenta){
        this.nombre = objCuenta.getNombre();
        this.numeroCuenta = objCuenta.getNumeroCuenta();
        this.saldo = objCuenta.getSaldo();
    }
    public void ingreso(double valor){
        this.saldo+= valor;
    }
    public void egreso(double val){
        this.saldo = saldo - val;
    }
    public void reintegro(double val){
        ingreso(val);
    }
    public void transferencia(double valorTra,CuentaCorriente cuentaDes){
        this.egreso(valorTra);
        cuentaDes.ingreso(valorTra);
    }
}