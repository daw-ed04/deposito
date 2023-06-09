/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cuentas;

/**
 * Gestiona los datos de una cuenta bancaria y
 * las operaciones que se realizan en ella
 * 
 * @author anónimo
 * @version 0.1
 */
public class CCuenta {

    /** 
     * Nombre del propietario de la cuenta
     */
    private String nombre;
    
    /** 
     * Número de la cuenta bancaria
     */
    private String cuenta;
    
    /** 
     * Saldo de la cuenta
     */
    private double saldo;
    
    /**
     * Tipo de interés aplicado
     */
    private double tipoInterés;

    /**
     * Método constructor sin parámetros
     */
    public CCuenta() {}

    /**
     * Método constructor mediante el que se 
     * inicializan los atributos de la clase
     * 
     * @param nom nombre del propietario
     * @param cue número de cuenta
     * @param sal saldo
     * @param tipo tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Establece el nombre del propietario
     * 
     * @param nom nombre del propietario
     * @see CCuenta#setNombre(String) 
     * @deprecated remplazado por {@link #setNombre(String)}
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }

    /**
     * Obtiene el nombre del propietario
     * 
     * @return nombre del propietario 
     * @see CCuenta#getNombre()
     * @deprecated remplazado por {@link #getNombre()}
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     * Devuelve el saldo de la cuenta
     * 
     * @return saldo
     * @see CCuenta#getSaldo()
     * @deprecated remplazado por {@link getSaldo()}
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método para ingresar dinero en la cuenta
     * 
     * @param cantidad
     * @throws Exception cantidad a ingresar negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método para retirar dinero de la cuenta
     * 
     * @param cantidad
     * @throws Exception cantidad a retirar negativa o saldo insuficiente
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Obtiene el número de la cuenta
     * 
     * @return número de cuenta 
     * @see CCuenta#getCuenta() 
     * @deprecated remplazado por {@link #getCuenta()}
     */
    public String obtenerCuenta()
    {
        return getCuenta();
    }

    /**
     * Obtiene el nombre del propietario
     * 
     * @return nombre del propietario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del propietario
     * 
     * @param nombre nombre del propietario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el tipo de interés
     * 
     * @return tipo de interés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés
     * 
     * @param tipoInterés tipo de interes
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Obtiene el número de la cuenta
     * 
     * @return número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de la cuenta
     * 
     * @param cuenta número de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo
     *  
     * @return saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo
     * 
     * @param saldo saldo de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
